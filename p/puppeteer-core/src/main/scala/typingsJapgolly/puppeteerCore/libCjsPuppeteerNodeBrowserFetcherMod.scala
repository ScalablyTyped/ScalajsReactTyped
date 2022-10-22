package typingsJapgolly.puppeteerCore

import typingsJapgolly.puppeteerCore.libCjsPuppeteerCommonProductMod.Product
import typingsJapgolly.puppeteerCore.puppeteerCoreStrings.chrome
import typingsJapgolly.puppeteerCore.puppeteerCoreStrings.firefox
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCjsPuppeteerNodeBrowserFetcherMod {
  
  @JSImport("puppeteer-core/lib/cjs/puppeteer/node/BrowserFetcher", "BrowserFetcher")
  @js.native
  /**
    * Constructs a browser fetcher for the given options.
    */
  open class BrowserFetcher () extends StObject {
    def this(options: BrowserFetcherOptions) = this()
    
    /**
      * Initiates a HEAD request to check if the revision is available.
      * @remarks
      * This method is affected by the current `product`.
      * @param revision - The revision to check availability for.
      * @returns A promise that resolves to `true` if the revision could be downloaded
      * from the host.
      */
    def canDownload(revision: String): js.Promise[Boolean] = js.native
    
    /**
      * Initiates a GET request to download the revision from the host.
      * @remarks
      * This method is affected by the current `product`.
      * @param revision - The revision to download.
      * @param progressCallback - A function that will be called with two arguments:
      * How many bytes have been downloaded and the total number of bytes of the download.
      * @returns A promise with revision information when the revision is downloaded
      * and extracted.
      */
    def download(revision: String): js.Promise[js.UndefOr[BrowserFetcherRevisionInfo]] = js.native
    def download(revision: String, progressCallback: js.Function2[/* x */ Double, /* y */ Double, Unit]): js.Promise[js.UndefOr[BrowserFetcherRevisionInfo]] = js.native
    
    /**
      * @returns The download host being used.
      */
    def host(): String = js.native
    
    /**
      * @remarks
      * This method is affected by the current `product`.
      * @returns A promise with a list of all revision strings (for the current `product`)
      * available locally on disk.
      */
    def localRevisions(): js.Promise[js.Array[String]] = js.native
    
    /**
      * @returns Returns the current `Platform`, which is one of `mac`, `linux`,
      * `win32` or `win64`.
      */
    def platform(): Platform = js.native
    
    /* private */ var `private`: Any = js.native
    
    /**
      * @returns Returns the current `Product`, which is one of `chrome` or
      * `firefox`.
      */
    def product(): Product = js.native
    
    /**
      * @remarks
      * This method is affected by the current `product`.
      * @param revision - A revision to remove for the current `product`.
      * @returns A promise that resolves when the revision has been removes or
      * throws if the revision has not been downloaded.
      */
    def remove(revision: String): js.Promise[Unit] = js.native
    
    /**
      * @param revision - The revision to get info for.
      * @returns The revision info for the given revision.
      */
    def revisionInfo(revision: String): BrowserFetcherRevisionInfo = js.native
  }
  
  trait BrowserFetcherOptions extends StObject {
    
    /**
      * Determines the host that will be used for downloading.
      */
    var host: js.UndefOr[String] = js.undefined
    
    /**
      * Determines the path to download browsers to.
      */
    var path: js.UndefOr[String] = js.undefined
    
    /**
      * Determines which platform the browser will be suited for.
      */
    var platform: js.UndefOr[Platform] = js.undefined
    
    /**
      * Determines which product the {@link BrowserFetcher} is for.
      *
      * @defaultValue `"chrome"`
      */
    var product: js.UndefOr[chrome | firefox] = js.undefined
  }
  object BrowserFetcherOptions {
    
    inline def apply(): BrowserFetcherOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BrowserFetcherOptions]
    }
    
    extension [Self <: BrowserFetcherOptions](x: Self) {
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setPlatform(value: Platform): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
      
      inline def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
      
      inline def setProduct(value: chrome | firefox): Self = StObject.set(x, "product", value.asInstanceOf[js.Any])
      
      inline def setProductUndefined: Self = StObject.set(x, "product", js.undefined)
    }
  }
  
  trait BrowserFetcherRevisionInfo extends StObject {
    
    var executablePath: String
    
    var folderPath: String
    
    var local: Boolean
    
    var product: String
    
    var revision: String
    
    var url: String
  }
  object BrowserFetcherRevisionInfo {
    
    inline def apply(
      executablePath: String,
      folderPath: String,
      local: Boolean,
      product: String,
      revision: String,
      url: String
    ): BrowserFetcherRevisionInfo = {
      val __obj = js.Dynamic.literal(executablePath = executablePath.asInstanceOf[js.Any], folderPath = folderPath.asInstanceOf[js.Any], local = local.asInstanceOf[js.Any], product = product.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[BrowserFetcherRevisionInfo]
    }
    
    extension [Self <: BrowserFetcherRevisionInfo](x: Self) {
      
      inline def setExecutablePath(value: String): Self = StObject.set(x, "executablePath", value.asInstanceOf[js.Any])
      
      inline def setFolderPath(value: String): Self = StObject.set(x, "folderPath", value.asInstanceOf[js.Any])
      
      inline def setLocal(value: Boolean): Self = StObject.set(x, "local", value.asInstanceOf[js.Any])
      
      inline def setProduct(value: String): Self = StObject.set(x, "product", value.asInstanceOf[js.Any])
      
      inline def setRevision(value: String): Self = StObject.set(x, "revision", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.linux
    - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.mac
    - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.mac_arm
    - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.win32
    - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.win64
  */
  trait Platform extends StObject
  object Platform {
    
    inline def linux: typingsJapgolly.puppeteerCore.puppeteerCoreStrings.linux = "linux".asInstanceOf[typingsJapgolly.puppeteerCore.puppeteerCoreStrings.linux]
    
    inline def mac: typingsJapgolly.puppeteerCore.puppeteerCoreStrings.mac = "mac".asInstanceOf[typingsJapgolly.puppeteerCore.puppeteerCoreStrings.mac]
    
    inline def mac_arm: typingsJapgolly.puppeteerCore.puppeteerCoreStrings.mac_arm = "mac_arm".asInstanceOf[typingsJapgolly.puppeteerCore.puppeteerCoreStrings.mac_arm]
    
    inline def win32: typingsJapgolly.puppeteerCore.puppeteerCoreStrings.win32 = "win32".asInstanceOf[typingsJapgolly.puppeteerCore.puppeteerCoreStrings.win32]
    
    inline def win64: typingsJapgolly.puppeteerCore.puppeteerCoreStrings.win64 = "win64".asInstanceOf[typingsJapgolly.puppeteerCore.puppeteerCoreStrings.win64]
  }
}
