package typingsJapgolly.antDesignReactNative.modalModalMod

import japgolly.scalajs.react.raw.React.Node
import typingsJapgolly.antDesignReactNative.AnonAnimateAppear
import typingsJapgolly.antDesignReactNative.AnonAntLocale
import typingsJapgolly.antDesignReactNative.modalPropsTypeMod.Action
import typingsJapgolly.antDesignReactNative.modalPropsTypeMod.CallbackOnBackHandler
import typingsJapgolly.antDesignReactNative.modalPropsTypeMod.CallbackOrActions
import typingsJapgolly.reactNative.mod.TextStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ant-design/react-native/lib/modal/Modal", JSImport.Default)
@js.native
class default () extends AntmModal

/* static members */
@JSImport("@ant-design/react-native/lib/modal/Modal", JSImport.Default)
@js.native
object default extends js.Object {
  var alert: js.Function4[
    /* title */ Node, 
    /* content */ Node, 
    /* actions */ js.UndefOr[js.Array[Action[TextStyle]]], 
    /* onBackHandler */ js.UndefOr[CallbackOnBackHandler], 
    Double
  ] = js.native
  var contextTypes: AnonAntLocale = js.native
  var defaultProps: AnonAnimateAppear = js.native
  var operation: js.Function2[
    /* actions */ js.Array[_], 
    /* onBackHandler */ js.UndefOr[CallbackOnBackHandler], 
    Double
  ] = js.native
  var prompt: js.Function7[
    /* title */ Node, 
    /* message */ Node, 
    /* callbackOrActions */ CallbackOrActions[TextStyle], 
    /* type */ js.UndefOr[String], 
    /* defaultValue */ js.UndefOr[String], 
    /* placeholders */ js.UndefOr[js.Array[String]], 
    /* onBackHandler */ js.UndefOr[CallbackOnBackHandler], 
    js.UndefOr[Double]
  ] = js.native
}

