package typingsJapgolly.orbitUiReactComponents

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSharedSrcKeysMod {
  
  @JSImport("@orbit-ui/react-components/dist/shared/src/keys", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait Keys extends StObject
  @JSImport("@orbit-ui/react-components/dist/shared/src/keys", "Keys")
  @js.native
  object Keys extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Keys & String] = js.native
    
    @js.native
    sealed trait arrowDown
      extends StObject
         with Keys
    /* "ArrowDown" */ val arrowDown: typingsJapgolly.orbitUiReactComponents.distSharedSrcKeysMod.Keys.arrowDown & String = js.native
    
    @js.native
    sealed trait arrowLeft
      extends StObject
         with Keys
    /* "ArrowLeft" */ val arrowLeft: typingsJapgolly.orbitUiReactComponents.distSharedSrcKeysMod.Keys.arrowLeft & String = js.native
    
    @js.native
    sealed trait arrowRight
      extends StObject
         with Keys
    /* "ArrowRight" */ val arrowRight: typingsJapgolly.orbitUiReactComponents.distSharedSrcKeysMod.Keys.arrowRight & String = js.native
    
    @js.native
    sealed trait arrowUp
      extends StObject
         with Keys
    /* "ArrowUp" */ val arrowUp: typingsJapgolly.orbitUiReactComponents.distSharedSrcKeysMod.Keys.arrowUp & String = js.native
    
    @js.native
    sealed trait backspace
      extends StObject
         with Keys
    /* "Backspace" */ val backspace: typingsJapgolly.orbitUiReactComponents.distSharedSrcKeysMod.Keys.backspace & String = js.native
    
    @js.native
    sealed trait delete
      extends StObject
         with Keys
    /* "Delete" */ val delete: typingsJapgolly.orbitUiReactComponents.distSharedSrcKeysMod.Keys.delete & String = js.native
    
    @js.native
    sealed trait end
      extends StObject
         with Keys
    /* "End" */ val end: typingsJapgolly.orbitUiReactComponents.distSharedSrcKeysMod.Keys.end & String = js.native
    
    @js.native
    sealed trait enter
      extends StObject
         with Keys
    /* "Enter" */ val enter: typingsJapgolly.orbitUiReactComponents.distSharedSrcKeysMod.Keys.enter & String = js.native
    
    @js.native
    sealed trait esc
      extends StObject
         with Keys
    /* "Escape" */ val esc: typingsJapgolly.orbitUiReactComponents.distSharedSrcKeysMod.Keys.esc & String = js.native
    
    @js.native
    sealed trait home
      extends StObject
         with Keys
    /* "Home" */ val home: typingsJapgolly.orbitUiReactComponents.distSharedSrcKeysMod.Keys.home & String = js.native
    
    @js.native
    sealed trait space
      extends StObject
         with Keys
    /* " " */ val space: typingsJapgolly.orbitUiReactComponents.distSharedSrcKeysMod.Keys.space & String = js.native
    
    @js.native
    sealed trait tab
      extends StObject
         with Keys
    /* "Tab" */ val tab: typingsJapgolly.orbitUiReactComponents.distSharedSrcKeysMod.Keys.tab & String = js.native
  }
  
  inline def appendEventKey(str: String, key: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("appendEventKey")(str.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[String]
}
