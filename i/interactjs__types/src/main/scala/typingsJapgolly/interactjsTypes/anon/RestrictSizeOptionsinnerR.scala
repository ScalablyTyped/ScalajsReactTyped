package typingsJapgolly.interactjsTypes.anon

import typingsJapgolly.interactjsTypes.coreTypesMod.ActionName
import typingsJapgolly.interactjsTypes.coreTypesMod.Point
import typingsJapgolly.interactjsTypes.coreTypesMod.RectResolvable
import typingsJapgolly.interactjsTypes.coreTypesMod.Size
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @interactjs/types.@interactjs/modifiers/restrict/size.RestrictSizeOptions & {  inner :@interactjs/types.@interactjs/core/types.Rect,   outer :@interactjs/types.@interactjs/core/types.Rect} */
trait RestrictSizeOptionsinnerR extends StObject {
  
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  var endOnly: Boolean
  
  var inner: typingsJapgolly.interactjsTypes.coreTypesMod.Rect
  
  var max: js.UndefOr[
    Size | Point | (RectResolvable[
      js.Tuple3[
        Double, 
        Double, 
        typingsJapgolly.interactjsTypes.coreInteractionMod.Interaction[ActionName]
      ]
    ])
  ] = js.undefined
  
  var min: js.UndefOr[
    Size | Point | (RectResolvable[
      js.Tuple3[
        Double, 
        Double, 
        typingsJapgolly.interactjsTypes.coreInteractionMod.Interaction[ActionName]
      ]
    ])
  ] = js.undefined
  
  var outer: typingsJapgolly.interactjsTypes.coreTypesMod.Rect
}
object RestrictSizeOptionsinnerR {
  
  inline def apply(
    endOnly: Boolean,
    inner: typingsJapgolly.interactjsTypes.coreTypesMod.Rect,
    outer: typingsJapgolly.interactjsTypes.coreTypesMod.Rect
  ): RestrictSizeOptionsinnerR = {
    val __obj = js.Dynamic.literal(endOnly = endOnly.asInstanceOf[js.Any], inner = inner.asInstanceOf[js.Any], outer = outer.asInstanceOf[js.Any])
    __obj.asInstanceOf[RestrictSizeOptionsinnerR]
  }
  
  extension [Self <: RestrictSizeOptionsinnerR](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setEndOnly(value: Boolean): Self = StObject.set(x, "endOnly", value.asInstanceOf[js.Any])
    
    inline def setInner(value: typingsJapgolly.interactjsTypes.coreTypesMod.Rect): Self = StObject.set(x, "inner", value.asInstanceOf[js.Any])
    
    inline def setMax(
      value: Size | Point | (RectResolvable[
          js.Tuple3[
            Double, 
            Double, 
            typingsJapgolly.interactjsTypes.coreInteractionMod.Interaction[ActionName]
          ]
        ])
    ): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxFunction1(
      value: js.Tuple3[
          Double, 
          Double, 
          typingsJapgolly.interactjsTypes.coreInteractionMod.Interaction[ActionName]
        ] => typingsJapgolly.interactjsTypes.coreTypesMod.Rect | typingsJapgolly.interactjsTypes.coreTypesMod.Element
    ): Self = StObject.set(x, "max", js.Any.fromFunction1(value))
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMin(
      value: Size | Point | (RectResolvable[
          js.Tuple3[
            Double, 
            Double, 
            typingsJapgolly.interactjsTypes.coreInteractionMod.Interaction[ActionName]
          ]
        ])
    ): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinFunction1(
      value: js.Tuple3[
          Double, 
          Double, 
          typingsJapgolly.interactjsTypes.coreInteractionMod.Interaction[ActionName]
        ] => typingsJapgolly.interactjsTypes.coreTypesMod.Rect | typingsJapgolly.interactjsTypes.coreTypesMod.Element
    ): Self = StObject.set(x, "min", js.Any.fromFunction1(value))
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    inline def setOuter(value: typingsJapgolly.interactjsTypes.coreTypesMod.Rect): Self = StObject.set(x, "outer", value.asInstanceOf[js.Any])
  }
}
