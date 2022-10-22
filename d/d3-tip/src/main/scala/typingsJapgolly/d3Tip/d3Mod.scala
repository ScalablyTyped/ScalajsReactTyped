package typingsJapgolly.d3Tip

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.SVGElement
import typingsJapgolly.d3Array.mod.Primitive
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object d3Mod {
  
  @JSImport("d3", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def tip(): Tooltip = ^.asInstanceOf[js.Dynamic].applyDynamic("tip")().asInstanceOf[Tooltip]
  
  @js.native
  trait Tooltip extends StObject {
    
    def attr(name: String): String = js.native
    def attr(name: String, value: Primitive): Tooltip = js.native
    def attr[Datum](
      name: String,
      value: js.Function3[/* datum */ Datum, /* index */ Double, /* outerIndex */ Double, Primitive]
    ): Tooltip = js.native
    def attr[Datum](
      obj: StringDictionary[
          Primitive | (js.Function3[/* datum */ Datum, /* index */ Double, /* outerIndex */ Double, Primitive])
        ]
    ): Tooltip = js.native
    
    def destroy(): Tooltip = js.native
    
    def direction(): TooltipDirection = js.native
    def direction(direction: TooltipDirection): Tooltip = js.native
    def direction[Datum](
      func: js.Function3[/* datum */ Datum, /* index */ Double, /* outerIndex */ Double, TooltipDirection]
    ): Tooltip = js.native
    
    def hide(): Tooltip = js.native
    
    def html(): String = js.native
    def html(content: String): Tooltip = js.native
    def html[Datum](func: js.Function3[/* datum */ Datum, /* index */ Double, /* outerIndex */ Double, String]): Tooltip = js.native
    
    def offset(): js.Tuple2[Double, Double] = js.native
    def offset(tuple: js.Tuple2[Double, Double]): Tooltip = js.native
    def offset[Datum](
      func: js.Function3[
          /* datum */ Datum, 
          /* index */ Double, 
          /* outerIndex */ Double, 
          js.Tuple2[Double, Double]
        ]
    ): Tooltip = js.native
    
    def rootElement(): HTMLElement = js.native
    def rootElement(element: HTMLElement): Tooltip = js.native
    def rootElement[Datum](func: js.Function3[/* datum */ Datum, /* index */ Double, /* outerIndex */ Double, HTMLElement]): Tooltip = js.native
    
    def show(): Tooltip = js.native
    def show(target: SVGElement): Tooltip = js.native
    def show[Datum](data: js.Array[Datum]): Tooltip = js.native
    def show[Datum](data: js.Array[Datum], target: SVGElement): Tooltip = js.native
    
    def style(name: String): String = js.native
    def style(name: String, value: Primitive): Tooltip = js.native
    def style(name: String, value: Primitive, priority: String): Tooltip = js.native
    def style[Datum](
      name: String,
      value: js.Function3[/* datum */ Datum, /* index */ Double, /* outerIndex */ Double, Primitive]
    ): Tooltip = js.native
    def style[Datum](
      name: String,
      value: js.Function3[/* datum */ Datum, /* index */ Double, /* outerIndex */ Double, Primitive],
      priority: String
    ): Tooltip = js.native
    def style[Datum](
      obj: StringDictionary[
          Primitive | (js.Function3[/* datum */ Datum, /* index */ Double, /* outerIndex */ Double, Primitive])
        ]
    ): Tooltip = js.native
    def style[Datum](
      obj: StringDictionary[
          Primitive | (js.Function3[/* datum */ Datum, /* index */ Double, /* outerIndex */ Double, Primitive])
        ],
      priority: String
    ): Tooltip = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.d3Tip.d3TipStrings.n
    - typingsJapgolly.d3Tip.d3TipStrings.s
    - typingsJapgolly.d3Tip.d3TipStrings.e
    - typingsJapgolly.d3Tip.d3TipStrings.w
    - typingsJapgolly.d3Tip.d3TipStrings.nw
    - typingsJapgolly.d3Tip.d3TipStrings.ne
    - typingsJapgolly.d3Tip.d3TipStrings.sw
    - typingsJapgolly.d3Tip.d3TipStrings.se
  */
  trait TooltipDirection extends StObject
  object TooltipDirection {
    
    inline def e: typingsJapgolly.d3Tip.d3TipStrings.e = "e".asInstanceOf[typingsJapgolly.d3Tip.d3TipStrings.e]
    
    inline def n: typingsJapgolly.d3Tip.d3TipStrings.n = "n".asInstanceOf[typingsJapgolly.d3Tip.d3TipStrings.n]
    
    inline def ne: typingsJapgolly.d3Tip.d3TipStrings.ne = "ne".asInstanceOf[typingsJapgolly.d3Tip.d3TipStrings.ne]
    
    inline def nw: typingsJapgolly.d3Tip.d3TipStrings.nw = "nw".asInstanceOf[typingsJapgolly.d3Tip.d3TipStrings.nw]
    
    inline def s: typingsJapgolly.d3Tip.d3TipStrings.s = "s".asInstanceOf[typingsJapgolly.d3Tip.d3TipStrings.s]
    
    inline def se: typingsJapgolly.d3Tip.d3TipStrings.se = "se".asInstanceOf[typingsJapgolly.d3Tip.d3TipStrings.se]
    
    inline def sw: typingsJapgolly.d3Tip.d3TipStrings.sw = "sw".asInstanceOf[typingsJapgolly.d3Tip.d3TipStrings.sw]
    
    inline def w: typingsJapgolly.d3Tip.d3TipStrings.w = "w".asInstanceOf[typingsJapgolly.d3Tip.d3TipStrings.w]
  }
}
