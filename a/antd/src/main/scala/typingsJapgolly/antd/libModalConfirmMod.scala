package typingsJapgolly.antd

import typingsJapgolly.antd.anon.Destroy
import typingsJapgolly.antd.anon.RootPrefixCls
import typingsJapgolly.antd.anon.Update
import typingsJapgolly.antd.antdStrings.confirm
import typingsJapgolly.antd.antdStrings.error
import typingsJapgolly.antd.antdStrings.info
import typingsJapgolly.antd.antdStrings.success
import typingsJapgolly.antd.antdStrings.warn
import typingsJapgolly.antd.antdStrings.warning
import typingsJapgolly.antd.libModalModalMod.ModalFuncProps
import typingsJapgolly.std.NonNullable
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libModalConfirmMod {
  
  @JSImport("antd/lib/modal/confirm", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(config: ModalFuncProps): Update = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(config.asInstanceOf[js.Any]).asInstanceOf[Update]
  
  inline def modalGlobalConfig(hasRootPrefixCls: RootPrefixCls): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("modalGlobalConfig")(hasRootPrefixCls.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def withConfirm(props: ModalFuncProps): ModalFuncProps = ^.asInstanceOf[js.Dynamic].applyDynamic("withConfirm")(props.asInstanceOf[js.Any]).asInstanceOf[ModalFuncProps]
  
  inline def withError(props: ModalFuncProps): ModalFuncProps = ^.asInstanceOf[js.Dynamic].applyDynamic("withError")(props.asInstanceOf[js.Any]).asInstanceOf[ModalFuncProps]
  
  inline def withInfo(props: ModalFuncProps): ModalFuncProps = ^.asInstanceOf[js.Dynamic].applyDynamic("withInfo")(props.asInstanceOf[js.Any]).asInstanceOf[ModalFuncProps]
  
  inline def withSuccess(props: ModalFuncProps): ModalFuncProps = ^.asInstanceOf[js.Dynamic].applyDynamic("withSuccess")(props.asInstanceOf[js.Any]).asInstanceOf[ModalFuncProps]
  
  inline def withWarn(props: ModalFuncProps): ModalFuncProps = ^.asInstanceOf[js.Dynamic].applyDynamic("withWarn")(props.asInstanceOf[js.Any]).asInstanceOf[ModalFuncProps]
  
  type ConfigUpdate = ModalFuncProps | (js.Function1[/* prevConfig */ ModalFuncProps, ModalFuncProps])
  
  type ModalFunc = js.Function1[/* props */ ModalFuncProps, Destroy]
  
  type ModalStaticFunctions = Record[
    NonNullable[js.UndefOr[info | success | error | warn | warning | confirm]], 
    ModalFunc
  ]
}
