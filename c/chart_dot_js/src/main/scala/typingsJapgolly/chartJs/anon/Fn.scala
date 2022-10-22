package typingsJapgolly.chartJs.anon

import typingsJapgolly.chartJs.chartJsStrings.boolean
import typingsJapgolly.chartJs.chartJsStrings.color
import typingsJapgolly.chartJs.chartJsStrings.number
import typingsJapgolly.chartJs.mod.ChartType
import typingsJapgolly.chartJs.mod.Scriptable
import typingsJapgolly.chartJs.mod.ScriptableContext
import typingsJapgolly.chartJs.typesBasicMod.AnyObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Fn[TType /* <: ChartType */] extends StObject {
  
  def fn[T](from: T, to: T, factor: Double): T
  
  /**
    * Start value for the animation. Current value is used when undefined
    */
  var from: Scriptable[
    typingsJapgolly.chartJs.typesColorMod.Color | Double | Boolean, 
    ScriptableContext[TType]
  ]
  
  var properties: js.Array[String]
  
  /**
    *
    */
  var to: Scriptable[
    typingsJapgolly.chartJs.typesColorMod.Color | Double | Boolean, 
    ScriptableContext[TType]
  ]
  
  /**
    * Type of property, determines the interpolator used. Possible values: 'number', 'color' and 'boolean'. Only really needed for 'color', because typeof does not get that right.
    */
  var `type`: color | number | boolean
}
object Fn {
  
  inline def apply[TType /* <: ChartType */](
    fn: (Any, Any, Double) => Any,
    from: Scriptable[
      typingsJapgolly.chartJs.typesColorMod.Color | Double | Boolean, 
      ScriptableContext[TType]
    ],
    properties: js.Array[String],
    to: Scriptable[
      typingsJapgolly.chartJs.typesColorMod.Color | Double | Boolean, 
      ScriptableContext[TType]
    ],
    `type`: color | number | boolean
  ): Fn[TType] = {
    val __obj = js.Dynamic.literal(fn = js.Any.fromFunction3(fn), from = from.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fn[TType]]
  }
  
  extension [Self <: Fn[?], TType /* <: ChartType */](x: Self & Fn[TType]) {
    
    inline def setFn(value: (Any, Any, Double) => Any): Self = StObject.set(x, "fn", js.Any.fromFunction3(value))
    
    inline def setFrom(
      value: Scriptable[
          typingsJapgolly.chartJs.typesColorMod.Color | Double | Boolean, 
          ScriptableContext[TType]
        ]
    ): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setFromFunction2(
      value: (ScriptableContext[TType], /* options */ AnyObject) => js.UndefOr[typingsJapgolly.chartJs.typesColorMod.Color | Double | Boolean]
    ): Self = StObject.set(x, "from", js.Any.fromFunction2(value))
    
    inline def setProperties(value: js.Array[String]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesVarargs(value: String*): Self = StObject.set(x, "properties", js.Array(value*))
    
    inline def setTo(
      value: Scriptable[
          typingsJapgolly.chartJs.typesColorMod.Color | Double | Boolean, 
          ScriptableContext[TType]
        ]
    ): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    inline def setToFunction2(
      value: (ScriptableContext[TType], /* options */ AnyObject) => js.UndefOr[typingsJapgolly.chartJs.typesColorMod.Color | Double | Boolean]
    ): Self = StObject.set(x, "to", js.Any.fromFunction2(value))
    
    inline def setType(value: color | number | boolean): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
