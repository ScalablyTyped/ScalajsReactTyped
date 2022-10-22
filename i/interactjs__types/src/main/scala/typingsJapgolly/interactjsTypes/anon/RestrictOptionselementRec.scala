package typingsJapgolly.interactjsTypes.anon

import typingsJapgolly.interactjsTypes.coreTypesMod.ActionName
import typingsJapgolly.interactjsTypes.coreTypesMod.RectResolvable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @interactjs/types.@interactjs/modifiers/restrict/pointer.RestrictOptions & {  elementRect :{  top :number,   left :number,   bottom :number,   right :number}} */
trait RestrictOptionselementRec extends StObject {
  
  var elementRect: typingsJapgolly.interactjsTypes.coreTypesMod.Rect & Right
  
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  var endOnly: Boolean
  
  var offset: typingsJapgolly.interactjsTypes.coreTypesMod.Rect
  
  var restriction: RectResolvable[
    js.Tuple3[
      Double, 
      Double, 
      typingsJapgolly.interactjsTypes.coreInteractionMod.Interaction[ActionName]
    ]
  ]
}
object RestrictOptionselementRec {
  
  inline def apply(
    elementRect: typingsJapgolly.interactjsTypes.coreTypesMod.Rect & Right,
    endOnly: Boolean,
    offset: typingsJapgolly.interactjsTypes.coreTypesMod.Rect,
    restriction: RectResolvable[
      js.Tuple3[
        Double, 
        Double, 
        typingsJapgolly.interactjsTypes.coreInteractionMod.Interaction[ActionName]
      ]
    ]
  ): RestrictOptionselementRec = {
    val __obj = js.Dynamic.literal(elementRect = elementRect.asInstanceOf[js.Any], endOnly = endOnly.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], restriction = restriction.asInstanceOf[js.Any])
    __obj.asInstanceOf[RestrictOptionselementRec]
  }
  
  extension [Self <: RestrictOptionselementRec](x: Self) {
    
    inline def setElementRect(value: typingsJapgolly.interactjsTypes.coreTypesMod.Rect & Right): Self = StObject.set(x, "elementRect", value.asInstanceOf[js.Any])
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setEndOnly(value: Boolean): Self = StObject.set(x, "endOnly", value.asInstanceOf[js.Any])
    
    inline def setOffset(value: typingsJapgolly.interactjsTypes.coreTypesMod.Rect): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setRestriction(
      value: RectResolvable[
          js.Tuple3[
            Double, 
            Double, 
            typingsJapgolly.interactjsTypes.coreInteractionMod.Interaction[ActionName]
          ]
        ]
    ): Self = StObject.set(x, "restriction", value.asInstanceOf[js.Any])
    
    inline def setRestrictionFunction1(
      value: js.Tuple3[
          Double, 
          Double, 
          typingsJapgolly.interactjsTypes.coreInteractionMod.Interaction[ActionName]
        ] => typingsJapgolly.interactjsTypes.coreTypesMod.Rect | typingsJapgolly.interactjsTypes.coreTypesMod.Element
    ): Self = StObject.set(x, "restriction", js.Any.fromFunction1(value))
  }
}
