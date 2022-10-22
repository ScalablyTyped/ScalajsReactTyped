package typingsJapgolly.miniprogram

import typingsJapgolly.miniprogram.anon.FileList
import typingsJapgolly.miniprogram.anon.Form
import typingsJapgolly.miniprogram.anon.From
import typingsJapgolly.miniprogram.anon.Response
import typingsJapgolly.miniprogram.anon.Text
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type ChoosePhoneContactArgs = AsyncCallback[ChoosePhoneContactCallbackValue]

type Common = Record[String, String | Double | Boolean]

type EmptyFn = js.Function0[Unit]

type GetClipboardArgs = AsyncCallback[Text]

type GetNetworkTypeArgs = AsyncCallback[GetNetworkTypeCallbackValue]

type GetOpenUserInfoArgs = AsyncCallback[Response]

type GetSavedFileListArgs = AsyncCallback[FileList]

type GetSystemInfoArgs = AsyncCallback[GetSystemInfoCallbackValue]

type OnPullDownRefresh = js.Function1[/* opts */ Form, Unit]

type OnTabItemTap = js.Function1[/* obj */ From, Unit]

type SelectorQueryExecCallback = js.Function1[/* ret */ Any, Unit]
