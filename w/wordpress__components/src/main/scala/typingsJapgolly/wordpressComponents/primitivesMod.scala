package typingsJapgolly.wordpressComponents

import org.scalajs.dom.SVGCircleElement
import org.scalajs.dom.SVGGElement
import org.scalajs.dom.SVGPathElement
import org.scalajs.dom.SVGPolygonElement
import org.scalajs.dom.SVGRectElement
import org.scalajs.dom.SVGSVGElement
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.SVGProps
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.blockquote
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.hr
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object primitivesMod {
  
  @JSImport("@wordpress/components/primitives", "BlockQuotation")
  @js.native
  val BlockQuotation: blockquote = js.native
  
  @JSImport("@wordpress/components/primitives", "Circle")
  @js.native
  val Circle: ComponentType[SVGProps[SVGCircleElement]] = js.native
  
  @JSImport("@wordpress/components/primitives", "G")
  @js.native
  val G: ComponentType[SVGProps[SVGGElement]] = js.native
  
  @JSImport("@wordpress/components/primitives", "HorizontalRule")
  @js.native
  val HorizontalRule: hr = js.native
  
  @JSImport("@wordpress/components/primitives", "Path")
  @js.native
  val Path: ComponentType[SVGProps[SVGPathElement]] = js.native
  
  @JSImport("@wordpress/components/primitives", "Polygon")
  @js.native
  val Polygon: ComponentType[SVGProps[SVGPolygonElement]] = js.native
  
  @JSImport("@wordpress/components/primitives", "Rect")
  @js.native
  val Rect: ComponentType[SVGProps[SVGRectElement]] = js.native
  
  @JSImport("@wordpress/components/primitives", "SVG")
  @js.native
  val SVG: ComponentType[SVGProps[SVGSVGElement]] = js.native
}
