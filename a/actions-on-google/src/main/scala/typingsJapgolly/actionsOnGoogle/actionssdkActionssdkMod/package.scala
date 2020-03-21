package typingsJapgolly.actionsOnGoogle

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object actionssdkActionssdkMod {
  type ActionSdkIntentHandlers = org.scalablytyped.runtime.StringDictionary[
    js.UndefOr[
      (typingsJapgolly.actionsOnGoogle.actionssdkActionssdkMod.ActionsSdkIntentHandler[
        js.Object, 
        js.Object, 
        typingsJapgolly.actionsOnGoogle.convMod.ActionsSdkConversation[js.Object, js.Object], 
        typingsJapgolly.actionsOnGoogle.argumentArgumentMod.Argument
      ]) | java.lang.String
    ]
  ]
  type ActionsSdkIntentHandler[TConvData, TUserStorage, TConversation /* <: typingsJapgolly.actionsOnGoogle.convMod.ActionsSdkConversation[TConvData, TUserStorage] */, TArgument /* <: typingsJapgolly.actionsOnGoogle.argumentArgumentMod.Argument */] = js.Function4[
    /* conv */ TConversation, 
    /* input */ java.lang.String, 
    /* argument */ TArgument, 
    /* status */ js.UndefOr[typingsJapgolly.actionsOnGoogle.v2Mod.GoogleRpcStatus], 
    js.Promise[js.Any] | js.Any
  ]
  type ActionsSdkMiddleware[TConversationPlugin /* <: typingsJapgolly.actionsOnGoogle.convMod.ActionsSdkConversation[js.Object, js.Object] */] = js.Function2[
    /* conv */ typingsJapgolly.actionsOnGoogle.convMod.ActionsSdkConversation[js.Object, js.Object], 
    /* framework */ typingsJapgolly.actionsOnGoogle.frameworkFrameworkMod.BuiltinFrameworkMetadata, 
    ((typingsJapgolly.actionsOnGoogle.convMod.ActionsSdkConversation[js.Object, js.Object]) with TConversationPlugin) | scala.Unit | (js.Promise[
      ((typingsJapgolly.actionsOnGoogle.convMod.ActionsSdkConversation[js.Object, js.Object]) with TConversationPlugin) | scala.Unit
    ])
  ]
}
