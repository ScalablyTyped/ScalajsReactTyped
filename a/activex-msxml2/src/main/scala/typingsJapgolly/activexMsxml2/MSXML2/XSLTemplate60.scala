package typingsJapgolly.activexMsxml2.MSXML2

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** XSL Stylesheet Cache 6.0 */
trait XSLTemplate60 extends StObject {
  
  /* private */ @JSName("MSXML2.XSLTemplate60_typekey")
  var MSXML2DotXSLTemplate60_typekey: XSLTemplate60
  
  /** create a new processor object */
  def createProcessor(): IXSLProcessor
  
  /** stylesheet to use with processors */
  var stylesheet: IXMLDOMNode
}
object XSLTemplate60 {
  
  inline def apply(
    MSXML2DotXSLTemplate60_typekey: XSLTemplate60,
    createProcessor: CallbackTo[IXSLProcessor],
    stylesheet: IXMLDOMNode
  ): XSLTemplate60 = {
    val __obj = js.Dynamic.literal(createProcessor = createProcessor.toJsFn, stylesheet = stylesheet.asInstanceOf[js.Any])
    __obj.updateDynamic("MSXML2.XSLTemplate60_typekey")(MSXML2DotXSLTemplate60_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[XSLTemplate60]
  }
  
  extension [Self <: XSLTemplate60](x: Self) {
    
    inline def setCreateProcessor(value: CallbackTo[IXSLProcessor]): Self = StObject.set(x, "createProcessor", value.toJsFn)
    
    inline def setMSXML2DotXSLTemplate60_typekey(value: XSLTemplate60): Self = StObject.set(x, "MSXML2.XSLTemplate60_typekey", value.asInstanceOf[js.Any])
    
    inline def setStylesheet(value: IXMLDOMNode): Self = StObject.set(x, "stylesheet", value.asInstanceOf[js.Any])
  }
}
