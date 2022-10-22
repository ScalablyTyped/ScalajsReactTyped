package typingsJapgolly.ejWebAll.global.ej

import org.scalajs.dom.Element
import typingsJapgolly.ejWebAll.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("ej.ColorPicker")
@js.native
open class ColorPicker protected ()
  extends StObject
     with typingsJapgolly.ejWebAll.ej.ColorPicker {
  def this(element: Element) = this()
  def this(element: JQuery) = this()
  def this(element: Element, options: typingsJapgolly.ejWebAll.ej.Model) = this()
  def this(element: JQuery, options: typingsJapgolly.ejWebAll.ej.Model) = this()
}
object ColorPicker {
  
  @JSGlobal("ej.ColorPicker")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("ej.ColorPicker.Locale")
  @js.native
  def Locale: Any = js.native
  inline def Locale_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Locale")(x.asInstanceOf[js.Any])
  
  @JSGlobal("ej.ColorPicker.ModelType")
  @js.native
  object ModelType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.ejWebAll.ej.ColorPicker.ModelType & Double] = js.native
    
    /* 0 */ val Palette: typingsJapgolly.ejWebAll.ej.ColorPicker.ModelType.Palette & Double = js.native
    
    /* 1 */ val Picker: typingsJapgolly.ejWebAll.ej.ColorPicker.ModelType.Picker & Double = js.native
  }
  
  @JSGlobal("ej.ColorPicker.Palette")
  @js.native
  object Palette extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.ejWebAll.ej.ColorPicker.Palette & Double] = js.native
    
    /* 0 */ val BasicPalette: typingsJapgolly.ejWebAll.ej.ColorPicker.Palette.BasicPalette & Double = js.native
    
    /* 1 */ val CustomPalette: typingsJapgolly.ejWebAll.ej.ColorPicker.Palette.CustomPalette & Double = js.native
  }
  
  @JSGlobal("ej.ColorPicker.Presets")
  @js.native
  object Presets extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.ejWebAll.ej.ColorPicker.Presets & Double] = js.native
    
    /* 0 */ val Basic: typingsJapgolly.ejWebAll.ej.ColorPicker.Presets.Basic & Double = js.native
    
    /* 1 */ val CandyCrush: typingsJapgolly.ejWebAll.ej.ColorPicker.Presets.CandyCrush & Double = js.native
    
    /* 2 */ val Citrus: typingsJapgolly.ejWebAll.ej.ColorPicker.Presets.Citrus & Double = js.native
    
    /* 3 */ val FlatColors: typingsJapgolly.ejWebAll.ej.ColorPicker.Presets.FlatColors & Double = js.native
    
    /* 4 */ val Misty: typingsJapgolly.ejWebAll.ej.ColorPicker.Presets.Misty & Double = js.native
    
    /* 5 */ val MoonLight: typingsJapgolly.ejWebAll.ej.ColorPicker.Presets.MoonLight & Double = js.native
    
    /* 6 */ val PinkShades: typingsJapgolly.ejWebAll.ej.ColorPicker.Presets.PinkShades & Double = js.native
    
    /* 7 */ val Sandy: typingsJapgolly.ejWebAll.ej.ColorPicker.Presets.Sandy & Double = js.native
    
    /* 8 */ val SeaWolf: typingsJapgolly.ejWebAll.ej.ColorPicker.Presets.SeaWolf & Double = js.native
    
    /* 9 */ val Vintage: typingsJapgolly.ejWebAll.ej.ColorPicker.Presets.Vintage & Double = js.native
    
    /* 10 */ val WebColors: typingsJapgolly.ejWebAll.ej.ColorPicker.Presets.WebColors & Double = js.native
  }
  
  /* static member */
  @JSGlobal("ej.ColorPicker.fn")
  @js.native
  def fn: typingsJapgolly.ejWebAll.ej.ColorPicker = js.native
  inline def fn_=(x: typingsJapgolly.ejWebAll.ej.ColorPicker): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}
