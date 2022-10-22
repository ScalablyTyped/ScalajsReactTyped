package typingsJapgolly.uiBox

import typingsJapgolly.std.Exclude
import typingsJapgolly.std.Pick
import typingsJapgolly.uiBox.distSrcTypesEnhancersMod.EnhancerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcUtilsSplitBoxPropsMod {
  
  @JSImport("ui-box/dist/src/utils/split-box-props", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[P /* <: EnhancerProps */](props: P): SplitBoxProps[P] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[SplitBoxProps[P]]
  
  trait SplitBoxProps[P /* <: EnhancerProps */] extends StObject {
    
    var matchedProps: Pick[
        P, 
        /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 143, starting with typingsJapgolly.uiBox.uiBoxStrings.borderColor, typingsJapgolly.uiBox.uiBoxStrings.gridTemplate, typingsJapgolly.uiBox.uiBoxStrings.backgroundImage */ Any
      ]
    
    var remainingProps: Pick[
        P, 
        Exclude[
          /* keyof P */ String, 
          /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 143, starting with typingsJapgolly.uiBox.uiBoxStrings.borderColor, typingsJapgolly.uiBox.uiBoxStrings.gridTemplate, typingsJapgolly.uiBox.uiBoxStrings.backgroundImage */ Any
        ]
      ]
  }
  object SplitBoxProps {
    
    inline def apply[P /* <: EnhancerProps */](
      matchedProps: Pick[
          P, 
          /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 143, starting with typingsJapgolly.uiBox.uiBoxStrings.borderColor, typingsJapgolly.uiBox.uiBoxStrings.gridTemplate, typingsJapgolly.uiBox.uiBoxStrings.backgroundImage */ Any
        ],
      remainingProps: Pick[
          P, 
          Exclude[
            /* keyof P */ String, 
            /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 143, starting with typingsJapgolly.uiBox.uiBoxStrings.borderColor, typingsJapgolly.uiBox.uiBoxStrings.gridTemplate, typingsJapgolly.uiBox.uiBoxStrings.backgroundImage */ Any
          ]
        ]
    ): SplitBoxProps[P] = {
      val __obj = js.Dynamic.literal(matchedProps = matchedProps.asInstanceOf[js.Any], remainingProps = remainingProps.asInstanceOf[js.Any])
      __obj.asInstanceOf[SplitBoxProps[P]]
    }
    
    extension [Self <: SplitBoxProps[?], P /* <: EnhancerProps */](x: Self & SplitBoxProps[P]) {
      
      inline def setMatchedProps(
        value: Pick[
              P, 
              /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 143, starting with typingsJapgolly.uiBox.uiBoxStrings.borderColor, typingsJapgolly.uiBox.uiBoxStrings.gridTemplate, typingsJapgolly.uiBox.uiBoxStrings.backgroundImage */ Any
            ]
      ): Self = StObject.set(x, "matchedProps", value.asInstanceOf[js.Any])
      
      inline def setRemainingProps(
        value: Pick[
              P, 
              Exclude[
                /* keyof P */ String, 
                /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 143, starting with typingsJapgolly.uiBox.uiBoxStrings.borderColor, typingsJapgolly.uiBox.uiBoxStrings.gridTemplate, typingsJapgolly.uiBox.uiBoxStrings.backgroundImage */ Any
              ]
            ]
      ): Self = StObject.set(x, "remainingProps", value.asInstanceOf[js.Any])
    }
  }
}
