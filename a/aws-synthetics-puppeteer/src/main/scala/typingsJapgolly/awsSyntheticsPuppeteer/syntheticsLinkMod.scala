package typingsJapgolly.awsSyntheticsPuppeteer

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.awsSyntheticsPuppeteer.anon.StatusCode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object syntheticsLinkMod {
  
  /**
    * This class handles the creation of result for Synthetics Link. For each link, add url, text, parent url, status and failure reason using the methods below.
    * An instance of SyntheticsLink can be added to broken link checker report using addLink(instanceOfSyntheticsLink).
    */
  @JSImport("SyntheticsLink", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with SyntheticsLink {
    def this(url: String) = this()
    
    /* CompleteClass */
    override def addScreenshotResult(screenshotResult: Any): Unit = js.native
    
    /* CompleteClass */
    var failureReason: String = js.native
    
    /* CompleteClass */
    override def getFailureReason(): String = js.native
    
    /* CompleteClass */
    override def getLinkNum(): Double = js.native
    
    /* CompleteClass */
    override def getParentUrl(): String = js.native
    
    /* CompleteClass */
    override def getScreenshotResult(): js.Array[Any] = js.native
    
    /* CompleteClass */
    override def getStatusCode(): String = js.native
    
    /* CompleteClass */
    override def getStatusText(): String = js.native
    
    /* CompleteClass */
    override def getText(): String = js.native
    
    /* CompleteClass */
    override def getUrl(): String = js.native
    
    /* CompleteClass */
    var linkNum: Double = js.native
    
    /* CompleteClass */
    var parentUrl: String = js.native
    
    /* CompleteClass */
    var screenshots: js.Array[Any] = js.native
    
    /* CompleteClass */
    var status: StatusCode = js.native
    
    /* CompleteClass */
    var text: String = js.native
    
    /* CompleteClass */
    var url: String = js.native
    
    /* CompleteClass */
    override def withFailureReason(failureReason: Any): SyntheticsLink = js.native
    
    /* CompleteClass */
    override def withLinkNum(linkNum: Double): SyntheticsLink = js.native
    
    /* CompleteClass */
    override def withParentUrl(parentUrl: Any): SyntheticsLink = js.native
    
    /* CompleteClass */
    override def withScreenshotResult(screenshotResults: Any): SyntheticsLink = js.native
    
    /* CompleteClass */
    override def withStatusCode(statusCode: Any): SyntheticsLink = js.native
    
    /* CompleteClass */
    override def withStatusText(statusText: Any): SyntheticsLink = js.native
    
    /* CompleteClass */
    override def withText(text: String): SyntheticsLink = js.native
    
    /* CompleteClass */
    override def withUrl(url: String): SyntheticsLink = js.native
  }
  
  /**
    * This class handles the creation of result for Synthetics Link. For each link, add url, text, parent url, status and failure reason using the methods below.
    * An instance of SyntheticsLink can be added to broken link checker report using addLink(instanceOfSyntheticsLink).
    */
  trait SyntheticsLink extends StObject {
    
    def addScreenshotResult(screenshotResult: Any): Unit
    
    var failureReason: String
    
    def getFailureReason(): String
    
    def getLinkNum(): Double
    
    def getParentUrl(): String
    
    def getScreenshotResult(): js.Array[Any]
    
    def getStatusCode(): String
    
    def getStatusText(): String
    
    def getText(): String
    
    def getUrl(): String
    
    var linkNum: Double
    
    var parentUrl: String
    
    var screenshots: js.Array[Any]
    
    var status: StatusCode
    
    var text: String
    
    var url: String
    
    def withFailureReason(failureReason: Any): SyntheticsLink
    
    def withLinkNum(linkNum: Double): SyntheticsLink
    
    def withParentUrl(parentUrl: Any): SyntheticsLink
    
    def withScreenshotResult(screenshotResults: Any): SyntheticsLink
    
    def withStatusCode(statusCode: Any): SyntheticsLink
    
    def withStatusText(statusText: Any): SyntheticsLink
    
    def withText(text: String): SyntheticsLink
    
    def withUrl(url: String): SyntheticsLink
  }
  object SyntheticsLink {
    
    inline def apply(
      addScreenshotResult: Any => Callback,
      failureReason: String,
      getFailureReason: CallbackTo[String],
      getLinkNum: CallbackTo[Double],
      getParentUrl: CallbackTo[String],
      getScreenshotResult: CallbackTo[js.Array[Any]],
      getStatusCode: CallbackTo[String],
      getStatusText: CallbackTo[String],
      getText: CallbackTo[String],
      getUrl: CallbackTo[String],
      linkNum: Double,
      parentUrl: String,
      screenshots: js.Array[Any],
      status: StatusCode,
      text: String,
      url: String,
      withFailureReason: Any => SyntheticsLink,
      withLinkNum: Double => SyntheticsLink,
      withParentUrl: Any => SyntheticsLink,
      withScreenshotResult: Any => SyntheticsLink,
      withStatusCode: Any => SyntheticsLink,
      withStatusText: Any => SyntheticsLink,
      withText: String => SyntheticsLink,
      withUrl: String => SyntheticsLink
    ): SyntheticsLink = {
      val __obj = js.Dynamic.literal(addScreenshotResult = js.Any.fromFunction1((t0: Any) => addScreenshotResult(t0).runNow()), failureReason = failureReason.asInstanceOf[js.Any], getFailureReason = getFailureReason.toJsFn, getLinkNum = getLinkNum.toJsFn, getParentUrl = getParentUrl.toJsFn, getScreenshotResult = getScreenshotResult.toJsFn, getStatusCode = getStatusCode.toJsFn, getStatusText = getStatusText.toJsFn, getText = getText.toJsFn, getUrl = getUrl.toJsFn, linkNum = linkNum.asInstanceOf[js.Any], parentUrl = parentUrl.asInstanceOf[js.Any], screenshots = screenshots.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], withFailureReason = js.Any.fromFunction1(withFailureReason), withLinkNum = js.Any.fromFunction1(withLinkNum), withParentUrl = js.Any.fromFunction1(withParentUrl), withScreenshotResult = js.Any.fromFunction1(withScreenshotResult), withStatusCode = js.Any.fromFunction1(withStatusCode), withStatusText = js.Any.fromFunction1(withStatusText), withText = js.Any.fromFunction1(withText), withUrl = js.Any.fromFunction1(withUrl))
      __obj.asInstanceOf[SyntheticsLink]
    }
    
    extension [Self <: SyntheticsLink](x: Self) {
      
      inline def setAddScreenshotResult(value: Any => Callback): Self = StObject.set(x, "addScreenshotResult", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
      
      inline def setFailureReason(value: String): Self = StObject.set(x, "failureReason", value.asInstanceOf[js.Any])
      
      inline def setGetFailureReason(value: CallbackTo[String]): Self = StObject.set(x, "getFailureReason", value.toJsFn)
      
      inline def setGetLinkNum(value: CallbackTo[Double]): Self = StObject.set(x, "getLinkNum", value.toJsFn)
      
      inline def setGetParentUrl(value: CallbackTo[String]): Self = StObject.set(x, "getParentUrl", value.toJsFn)
      
      inline def setGetScreenshotResult(value: CallbackTo[js.Array[Any]]): Self = StObject.set(x, "getScreenshotResult", value.toJsFn)
      
      inline def setGetStatusCode(value: CallbackTo[String]): Self = StObject.set(x, "getStatusCode", value.toJsFn)
      
      inline def setGetStatusText(value: CallbackTo[String]): Self = StObject.set(x, "getStatusText", value.toJsFn)
      
      inline def setGetText(value: CallbackTo[String]): Self = StObject.set(x, "getText", value.toJsFn)
      
      inline def setGetUrl(value: CallbackTo[String]): Self = StObject.set(x, "getUrl", value.toJsFn)
      
      inline def setLinkNum(value: Double): Self = StObject.set(x, "linkNum", value.asInstanceOf[js.Any])
      
      inline def setParentUrl(value: String): Self = StObject.set(x, "parentUrl", value.asInstanceOf[js.Any])
      
      inline def setScreenshots(value: js.Array[Any]): Self = StObject.set(x, "screenshots", value.asInstanceOf[js.Any])
      
      inline def setScreenshotsVarargs(value: Any*): Self = StObject.set(x, "screenshots", js.Array(value*))
      
      inline def setStatus(value: StatusCode): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setWithFailureReason(value: Any => SyntheticsLink): Self = StObject.set(x, "withFailureReason", js.Any.fromFunction1(value))
      
      inline def setWithLinkNum(value: Double => SyntheticsLink): Self = StObject.set(x, "withLinkNum", js.Any.fromFunction1(value))
      
      inline def setWithParentUrl(value: Any => SyntheticsLink): Self = StObject.set(x, "withParentUrl", js.Any.fromFunction1(value))
      
      inline def setWithScreenshotResult(value: Any => SyntheticsLink): Self = StObject.set(x, "withScreenshotResult", js.Any.fromFunction1(value))
      
      inline def setWithStatusCode(value: Any => SyntheticsLink): Self = StObject.set(x, "withStatusCode", js.Any.fromFunction1(value))
      
      inline def setWithStatusText(value: Any => SyntheticsLink): Self = StObject.set(x, "withStatusText", js.Any.fromFunction1(value))
      
      inline def setWithText(value: String => SyntheticsLink): Self = StObject.set(x, "withText", js.Any.fromFunction1(value))
      
      inline def setWithUrl(value: String => SyntheticsLink): Self = StObject.set(x, "withUrl", js.Any.fromFunction1(value))
    }
  }
}
