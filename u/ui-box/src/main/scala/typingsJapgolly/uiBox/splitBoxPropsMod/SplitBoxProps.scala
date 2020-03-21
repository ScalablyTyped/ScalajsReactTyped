package typingsJapgolly.uiBox.splitBoxPropsMod

import typingsJapgolly.std.Exclude
import typingsJapgolly.std.Pick
import typingsJapgolly.uiBox.typesEnhancersMod.EnhancerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SplitBoxProps[P /* <: EnhancerProps */] extends js.Object {
  var matchedProps: Pick[
    P, 
    /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 140 */ js.Any
  ]
  var remainingProps: Pick[
    P, 
    Exclude[
      String, 
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 140 */ js.Any
    ]
  ]
}

object SplitBoxProps {
  @scala.inline
  def apply[P /* <: EnhancerProps */](
    matchedProps: Pick[
      P, 
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 140 */ js.Any
    ],
    remainingProps: Pick[
      P, 
      Exclude[
        String, 
        /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 140 */ js.Any
      ]
    ]
  ): SplitBoxProps[P] = {
    val __obj = js.Dynamic.literal(matchedProps = matchedProps.asInstanceOf[js.Any], remainingProps = remainingProps.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SplitBoxProps[P]]
  }
}

