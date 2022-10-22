package typingsJapgolly.texzilla

import org.scalajs.dom.DOMParser
import org.scalajs.dom.Document
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLImageElement
import org.scalajs.dom.XMLSerializer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("texzilla", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def filterElement(el: Element): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("filterElement")(el.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def filterElement(el: Element, throwOnError: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("filterElement")(el.asInstanceOf[js.Any], throwOnError.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def filterString(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("filterString")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def filterString(str: String, throwOnError: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("filterString")(str.asInstanceOf[js.Any], throwOnError.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getTeXSource(el: String): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getTeXSource")(el.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  inline def getTeXSource(el: Element): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getTeXSource")(el.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  
  inline def setDOMParser(parser: DOMParser): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setDOMParser")(parser.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def setItexIdentifierMode(enabled: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setItexIdentifierMode")(enabled.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def setSafeMode(enabled: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setSafeMode")(enabled.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def setXMLSerializer(serializer: XMLSerializer): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setXMLSerializer")(serializer.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def toImage(str: String): HTMLImageElement = ^.asInstanceOf[js.Dynamic].applyDynamic("toImage")(str.asInstanceOf[js.Any]).asInstanceOf[HTMLImageElement]
  inline def toImage(str: String, rightToLeft: Boolean): HTMLImageElement = (^.asInstanceOf[js.Dynamic].applyDynamic("toImage")(str.asInstanceOf[js.Any], rightToLeft.asInstanceOf[js.Any])).asInstanceOf[HTMLImageElement]
  inline def toImage(str: String, rightToLeft: Boolean, roundToPowerOfTwo: Boolean): HTMLImageElement = (^.asInstanceOf[js.Dynamic].applyDynamic("toImage")(str.asInstanceOf[js.Any], rightToLeft.asInstanceOf[js.Any], roundToPowerOfTwo.asInstanceOf[js.Any])).asInstanceOf[HTMLImageElement]
  inline def toImage(str: String, rightToLeft: Boolean, roundToPowerOfTwo: Boolean, size: Double): HTMLImageElement = (^.asInstanceOf[js.Dynamic].applyDynamic("toImage")(str.asInstanceOf[js.Any], rightToLeft.asInstanceOf[js.Any], roundToPowerOfTwo.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[HTMLImageElement]
  inline def toImage(str: String, rightToLeft: Boolean, roundToPowerOfTwo: Boolean, size: Double, document: Document): HTMLImageElement = (^.asInstanceOf[js.Dynamic].applyDynamic("toImage")(str.asInstanceOf[js.Any], rightToLeft.asInstanceOf[js.Any], roundToPowerOfTwo.asInstanceOf[js.Any], size.asInstanceOf[js.Any], document.asInstanceOf[js.Any])).asInstanceOf[HTMLImageElement]
  inline def toImage(str: String, rightToLeft: Boolean, roundToPowerOfTwo: Boolean, size: Unit, document: Document): HTMLImageElement = (^.asInstanceOf[js.Dynamic].applyDynamic("toImage")(str.asInstanceOf[js.Any], rightToLeft.asInstanceOf[js.Any], roundToPowerOfTwo.asInstanceOf[js.Any], size.asInstanceOf[js.Any], document.asInstanceOf[js.Any])).asInstanceOf[HTMLImageElement]
  inline def toImage(str: String, rightToLeft: Boolean, roundToPowerOfTwo: Unit, size: Double): HTMLImageElement = (^.asInstanceOf[js.Dynamic].applyDynamic("toImage")(str.asInstanceOf[js.Any], rightToLeft.asInstanceOf[js.Any], roundToPowerOfTwo.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[HTMLImageElement]
  inline def toImage(str: String, rightToLeft: Boolean, roundToPowerOfTwo: Unit, size: Double, document: Document): HTMLImageElement = (^.asInstanceOf[js.Dynamic].applyDynamic("toImage")(str.asInstanceOf[js.Any], rightToLeft.asInstanceOf[js.Any], roundToPowerOfTwo.asInstanceOf[js.Any], size.asInstanceOf[js.Any], document.asInstanceOf[js.Any])).asInstanceOf[HTMLImageElement]
  inline def toImage(str: String, rightToLeft: Boolean, roundToPowerOfTwo: Unit, size: Unit, document: Document): HTMLImageElement = (^.asInstanceOf[js.Dynamic].applyDynamic("toImage")(str.asInstanceOf[js.Any], rightToLeft.asInstanceOf[js.Any], roundToPowerOfTwo.asInstanceOf[js.Any], size.asInstanceOf[js.Any], document.asInstanceOf[js.Any])).asInstanceOf[HTMLImageElement]
  inline def toImage(str: String, rightToLeft: Unit, roundToPowerOfTwo: Boolean): HTMLImageElement = (^.asInstanceOf[js.Dynamic].applyDynamic("toImage")(str.asInstanceOf[js.Any], rightToLeft.asInstanceOf[js.Any], roundToPowerOfTwo.asInstanceOf[js.Any])).asInstanceOf[HTMLImageElement]
  inline def toImage(str: String, rightToLeft: Unit, roundToPowerOfTwo: Boolean, size: Double): HTMLImageElement = (^.asInstanceOf[js.Dynamic].applyDynamic("toImage")(str.asInstanceOf[js.Any], rightToLeft.asInstanceOf[js.Any], roundToPowerOfTwo.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[HTMLImageElement]
  inline def toImage(str: String, rightToLeft: Unit, roundToPowerOfTwo: Boolean, size: Double, document: Document): HTMLImageElement = (^.asInstanceOf[js.Dynamic].applyDynamic("toImage")(str.asInstanceOf[js.Any], rightToLeft.asInstanceOf[js.Any], roundToPowerOfTwo.asInstanceOf[js.Any], size.asInstanceOf[js.Any], document.asInstanceOf[js.Any])).asInstanceOf[HTMLImageElement]
  inline def toImage(str: String, rightToLeft: Unit, roundToPowerOfTwo: Boolean, size: Unit, document: Document): HTMLImageElement = (^.asInstanceOf[js.Dynamic].applyDynamic("toImage")(str.asInstanceOf[js.Any], rightToLeft.asInstanceOf[js.Any], roundToPowerOfTwo.asInstanceOf[js.Any], size.asInstanceOf[js.Any], document.asInstanceOf[js.Any])).asInstanceOf[HTMLImageElement]
  inline def toImage(str: String, rightToLeft: Unit, roundToPowerOfTwo: Unit, size: Double): HTMLImageElement = (^.asInstanceOf[js.Dynamic].applyDynamic("toImage")(str.asInstanceOf[js.Any], rightToLeft.asInstanceOf[js.Any], roundToPowerOfTwo.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[HTMLImageElement]
  inline def toImage(str: String, rightToLeft: Unit, roundToPowerOfTwo: Unit, size: Double, document: Document): HTMLImageElement = (^.asInstanceOf[js.Dynamic].applyDynamic("toImage")(str.asInstanceOf[js.Any], rightToLeft.asInstanceOf[js.Any], roundToPowerOfTwo.asInstanceOf[js.Any], size.asInstanceOf[js.Any], document.asInstanceOf[js.Any])).asInstanceOf[HTMLImageElement]
  inline def toImage(str: String, rightToLeft: Unit, roundToPowerOfTwo: Unit, size: Unit, document: Document): HTMLImageElement = (^.asInstanceOf[js.Dynamic].applyDynamic("toImage")(str.asInstanceOf[js.Any], rightToLeft.asInstanceOf[js.Any], roundToPowerOfTwo.asInstanceOf[js.Any], size.asInstanceOf[js.Any], document.asInstanceOf[js.Any])).asInstanceOf[HTMLImageElement]
  
  inline def toMathML(str: String): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("toMathML")(str.asInstanceOf[js.Any]).asInstanceOf[Element]
  inline def toMathML(str: String, displayMode: Boolean): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("toMathML")(str.asInstanceOf[js.Any], displayMode.asInstanceOf[js.Any])).asInstanceOf[Element]
  inline def toMathML(str: String, displayMode: Boolean, rightToLeft: Boolean): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("toMathML")(str.asInstanceOf[js.Any], displayMode.asInstanceOf[js.Any], rightToLeft.asInstanceOf[js.Any])).asInstanceOf[Element]
  inline def toMathML(str: String, displayMode: Boolean, rightToLeft: Boolean, throwOnError: Boolean): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("toMathML")(str.asInstanceOf[js.Any], displayMode.asInstanceOf[js.Any], rightToLeft.asInstanceOf[js.Any], throwOnError.asInstanceOf[js.Any])).asInstanceOf[Element]
  inline def toMathML(str: String, displayMode: Boolean, rightToLeft: Unit, throwOnError: Boolean): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("toMathML")(str.asInstanceOf[js.Any], displayMode.asInstanceOf[js.Any], rightToLeft.asInstanceOf[js.Any], throwOnError.asInstanceOf[js.Any])).asInstanceOf[Element]
  inline def toMathML(str: String, displayMode: Unit, rightToLeft: Boolean): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("toMathML")(str.asInstanceOf[js.Any], displayMode.asInstanceOf[js.Any], rightToLeft.asInstanceOf[js.Any])).asInstanceOf[Element]
  inline def toMathML(str: String, displayMode: Unit, rightToLeft: Boolean, throwOnError: Boolean): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("toMathML")(str.asInstanceOf[js.Any], displayMode.asInstanceOf[js.Any], rightToLeft.asInstanceOf[js.Any], throwOnError.asInstanceOf[js.Any])).asInstanceOf[Element]
  inline def toMathML(str: String, displayMode: Unit, rightToLeft: Unit, throwOnError: Boolean): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("toMathML")(str.asInstanceOf[js.Any], displayMode.asInstanceOf[js.Any], rightToLeft.asInstanceOf[js.Any], throwOnError.asInstanceOf[js.Any])).asInstanceOf[Element]
  
  inline def toMathMLString(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toMathMLString")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def toMathMLString(str: String, displayMode: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toMathMLString")(str.asInstanceOf[js.Any], displayMode.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def toMathMLString(str: String, displayMode: Boolean, rightToLeft: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toMathMLString")(str.asInstanceOf[js.Any], displayMode.asInstanceOf[js.Any], rightToLeft.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def toMathMLString(str: String, displayMode: Boolean, rightToLeft: Boolean, throwOnError: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toMathMLString")(str.asInstanceOf[js.Any], displayMode.asInstanceOf[js.Any], rightToLeft.asInstanceOf[js.Any], throwOnError.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def toMathMLString(str: String, displayMode: Boolean, rightToLeft: Unit, throwOnError: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toMathMLString")(str.asInstanceOf[js.Any], displayMode.asInstanceOf[js.Any], rightToLeft.asInstanceOf[js.Any], throwOnError.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def toMathMLString(str: String, displayMode: Unit, rightToLeft: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toMathMLString")(str.asInstanceOf[js.Any], displayMode.asInstanceOf[js.Any], rightToLeft.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def toMathMLString(str: String, displayMode: Unit, rightToLeft: Boolean, throwOnError: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toMathMLString")(str.asInstanceOf[js.Any], displayMode.asInstanceOf[js.Any], rightToLeft.asInstanceOf[js.Any], throwOnError.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def toMathMLString(str: String, displayMode: Unit, rightToLeft: Unit, throwOnError: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toMathMLString")(str.asInstanceOf[js.Any], displayMode.asInstanceOf[js.Any], rightToLeft.asInstanceOf[js.Any], throwOnError.asInstanceOf[js.Any])).asInstanceOf[String]
}
