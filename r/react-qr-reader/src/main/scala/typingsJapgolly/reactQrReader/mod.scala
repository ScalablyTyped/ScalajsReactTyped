package typingsJapgolly.reactQrReader

import japgolly.scalajs.react.ReactEventFrom
import org.scalajs.dom.HTMLImageElement
import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactQrReader.reactQrReaderBooleans.`false`
import typingsJapgolly.reactQrReader.reactQrReaderStrings.environment
import typingsJapgolly.reactQrReader.reactQrReaderStrings.user
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-qr-reader", JSImport.Namespace)
  @js.native
  open class ^ () extends QrReader
  
  @js.native
  trait QrReader
    extends Component[typingsJapgolly.reactQrReader.mod.props, js.Object, Any] {
    
    def openImageDialog(): Unit = js.native
  }
  
  @js.native
  trait props extends StObject {
    
    var className: js.UndefOr[String] = js.native
    
    var delay: js.UndefOr[Double | `false`] = js.native
    
    var facingMode: js.UndefOr[user | environment] = js.native
    
    var legacyMode: js.UndefOr[Boolean] = js.native
    
    def onError(err: Any): Unit = js.native
    
    var onImageLoad: js.UndefOr[js.Function1[/* event */ ReactEventFrom[HTMLImageElement], Unit]] = js.native
    
    var onLoad: js.UndefOr[js.Function0[Unit]] = js.native
    
    def onScan(): Unit = js.native
    def onScan(data: String): Unit = js.native
    
    var resolution: js.UndefOr[Double] = js.native
    
    var showViewFinder: js.UndefOr[Boolean] = js.native
    
    var style: js.UndefOr[Any] = js.native
  }
}
