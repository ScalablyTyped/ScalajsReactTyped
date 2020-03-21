package typingsJapgolly.actionsOnGoogle

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object dialogflowDialogflowMod {
  type DialogflowIntentHandler[TConvData, TUserStorage, TContexts /* <: typingsJapgolly.actionsOnGoogle.contextMod.Contexts */, TConversation /* <: typingsJapgolly.actionsOnGoogle.dialogflowConvMod.DialogflowConversation[TConvData, TUserStorage, TContexts] */, TParameters /* <: typingsJapgolly.actionsOnGoogle.contextMod.Parameters */, TArgument /* <: typingsJapgolly.actionsOnGoogle.argumentArgumentMod.Argument */] = js.Function4[
    /* conv */ TConversation, 
    /* params */ TParameters, 
    /* argument */ TArgument, 
    /* status */ js.UndefOr[typingsJapgolly.actionsOnGoogle.v2Mod.GoogleRpcStatus], 
    js.Promise[js.Any] | js.Any
  ]
  type DialogflowIntentHandlers = org.scalablytyped.runtime.StringDictionary[js.UndefOr[js.Function | java.lang.String]]
  type DialogflowMiddleware[TConversationPlugin /* <: typingsJapgolly.actionsOnGoogle.dialogflowConvMod.DialogflowConversation[
    typingsJapgolly.actionsOnGoogle.commonMod.JsonObject, 
    typingsJapgolly.actionsOnGoogle.commonMod.JsonObject, 
    typingsJapgolly.actionsOnGoogle.contextMod.Contexts
  ] */] = js.Function2[
    /* conv */ typingsJapgolly.actionsOnGoogle.dialogflowConvMod.DialogflowConversation[
      typingsJapgolly.actionsOnGoogle.commonMod.JsonObject, 
      typingsJapgolly.actionsOnGoogle.commonMod.JsonObject, 
      typingsJapgolly.actionsOnGoogle.contextMod.Contexts
    ], 
    /* framework */ typingsJapgolly.actionsOnGoogle.frameworkFrameworkMod.BuiltinFrameworkMetadata, 
    ((typingsJapgolly.actionsOnGoogle.dialogflowConvMod.DialogflowConversation[
      typingsJapgolly.actionsOnGoogle.commonMod.JsonObject, 
      typingsJapgolly.actionsOnGoogle.commonMod.JsonObject, 
      typingsJapgolly.actionsOnGoogle.contextMod.Contexts
    ]) with TConversationPlugin) | scala.Unit | (js.Promise[
      ((typingsJapgolly.actionsOnGoogle.dialogflowConvMod.DialogflowConversation[
        typingsJapgolly.actionsOnGoogle.commonMod.JsonObject, 
        typingsJapgolly.actionsOnGoogle.commonMod.JsonObject, 
        typingsJapgolly.actionsOnGoogle.contextMod.Contexts
      ]) with TConversationPlugin) | scala.Unit
    ])
  ]
  type DialogflowVerificationHeaders = /**
    * A header key value pair to check against.
    * @public
    */
  org.scalablytyped.runtime.StringDictionary[java.lang.String]
}
