package typingsJapgolly.orbitUiReactComponents

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSharedSrcFocusTargetMod {
  
  @js.native
  sealed trait FocusTarget extends StObject
  @JSImport("@orbit-ui/react-components/dist/shared/src/focusTarget", "FocusTarget")
  @js.native
  object FocusTarget extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[FocusTarget & String] = js.native
    
    @js.native
    sealed trait first
      extends StObject
         with FocusTarget
    /* "first" */ val first: typingsJapgolly.orbitUiReactComponents.distSharedSrcFocusTargetMod.FocusTarget.first & String = js.native
    
    @js.native
    sealed trait last
      extends StObject
         with FocusTarget
    /* "last" */ val last: typingsJapgolly.orbitUiReactComponents.distSharedSrcFocusTargetMod.FocusTarget.last & String = js.native
  }
}
