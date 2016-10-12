package com.rnfs;


kpublic class DoDownload implements Runnable {
  private SparseArray<Downloader> downloaders;
  private Downloader downloader;
  private DownloadParams params;
  private int jobId;

  public DoDownload(Downloader downloader, DownloadParams params) {
    this.downloader = downloader;
    this.params = params;
  }

  public void run() {
    this.downloader.execute(this.params);
  }
}
