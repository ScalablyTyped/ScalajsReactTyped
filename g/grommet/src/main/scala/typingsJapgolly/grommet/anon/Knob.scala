package typingsJapgolly.grommet.anon

import typingsJapgolly.grommet.es6ThemesBaseMod.ExtendProps
import typingsJapgolly.grommet.es6ThemesBaseMod.ExtendType
import typingsJapgolly.grommet.es6ThemesBaseMod.ExtendValue
import typingsJapgolly.grommet.es6UtilsMod.BackgroundType
import typingsJapgolly.grommet.es6UtilsMod.ColorType
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Knob extends StObject {
  
  var background: js.UndefOr[BackgroundType] = js.undefined
  
  var color: js.UndefOr[ColorType] = js.undefined
  
  var extend: js.UndefOr[ExtendType[Record[String, Any]]] = js.undefined
  
  var knob: js.UndefOr[`10`] = js.undefined
  
  var radius: js.UndefOr[String] = js.undefined
  
  var size: js.UndefOr[String] = js.undefined
}
object Knob {
  
  inline def apply(): Knob = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Knob]
  }
  
  extension [Self <: Knob](x: Self) {
    
    inline def setBackground(value: BackgroundType): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
    
    inline def setColor(value: ColorType): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setExtend(value: ExtendType[Record[String, Any]]): Self = StObject.set(x, "extend", value.asInstanceOf[js.Any])
    
    inline def setExtendFunction1(value: /* props */ ExtendProps[Record[String, Any]] => ExtendValue[Record[String, Any]]): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    inline def setExtendUndefined: Self = StObject.set(x, "extend", js.undefined)
    
    inline def setKnob(value: `10`): Self = StObject.set(x, "knob", value.asInstanceOf[js.Any])
    
    inline def setKnobUndefined: Self = StObject.set(x, "knob", js.undefined)
    
    inline def setRadius(value: String): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    inline def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
    
    inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
