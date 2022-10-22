package typingsJapgolly.reactNativeModal

import typingsJapgolly.reactNativeModal.anon.AnimationIn
import typingsJapgolly.reactNativeModal.anon.AnimationInTiming
import typingsJapgolly.reactNativeModal.anon.IsVisible
import typingsJapgolly.reactNativeModal.anon.ReadonlyModalProps
import typingsJapgolly.reactNativeModal.distModalMod.ModalProps
import typingsJapgolly.reactNativeModal.distModalMod.State
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-native-modal", JSImport.Default)
  @js.native
  open class default protected ()
    extends typingsJapgolly.reactNativeModal.distModalMod.ReactNativeModal {
    def this(props: ModalProps) = this()
  }
  /* static members */
  object default {
    
    @JSImport("react-native-modal", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-native-modal", "default.defaultProps")
    @js.native
    def defaultProps: AnimationInTiming = js.native
    inline def defaultProps_=(x: AnimationInTiming): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    inline def getDerivedStateFromProps(nextProps: ReadonlyModalProps, state: State): IsVisible | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getDerivedStateFromProps")(nextProps.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[IsVisible | Null]
    
    @JSImport("react-native-modal", "default.propTypes")
    @js.native
    def propTypes: AnimationIn = js.native
    inline def propTypes_=(x: AnimationIn): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("react-native-modal", "ReactNativeModal")
  @js.native
  open class ReactNativeModal protected ()
    extends typingsJapgolly.reactNativeModal.distModalMod.ReactNativeModal {
    def this(props: ModalProps) = this()
  }
  /* static members */
  object ReactNativeModal {
    
    @JSImport("react-native-modal", "ReactNativeModal")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-native-modal", "ReactNativeModal.defaultProps")
    @js.native
    def defaultProps: AnimationInTiming = js.native
    inline def defaultProps_=(x: AnimationInTiming): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    inline def getDerivedStateFromProps(nextProps: ReadonlyModalProps, state: State): IsVisible | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getDerivedStateFromProps")(nextProps.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[IsVisible | Null]
    
    @JSImport("react-native-modal", "ReactNativeModal.propTypes")
    @js.native
    def propTypes: AnimationIn = js.native
    inline def propTypes_=(x: AnimationIn): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
}
