package typingsJapgolly.antvDomUtil

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.HTMLElement
import typingsJapgolly.antvDomUtil.anon.Remove
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@antv/dom-util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addEventListener(target: HTMLElement, eventType: String, callback: Any): Remove = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(target.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Remove]
  
  inline def createDom(str: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createDom")(str.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def getHeight(el: HTMLElement): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getHeight")(el.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def getHeight(el: HTMLElement, defaultValue: Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getHeight")(el.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getOuterHeight(el: HTMLElement): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getOuterHeight")(el.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def getOuterHeight(el: HTMLElement, defaultValue: Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getOuterHeight")(el.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getOuterWidth(el: HTMLElement): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getOuterWidth")(el.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def getOuterWidth(el: HTMLElement, defaultValue: Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getOuterWidth")(el.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getRatio(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getRatio")().asInstanceOf[Double]
  
  inline def getStyle(dom: HTMLElement, name: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getStyle")(dom.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def getStyle(dom: HTMLElement, name: String, defaultValue: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getStyle")(dom.asInstanceOf[js.Any], name.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def getWidth(el: HTMLElement): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getWidth")(el.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def getWidth(el: HTMLElement, defaultValue: Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getWidth")(el.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def modifyCSS(dom: HTMLElement, css: StringDictionary[Any]): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("modifyCSS")(dom.asInstanceOf[js.Any], css.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
}
