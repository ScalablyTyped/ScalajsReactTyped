package typingsJapgolly.awsLambda.triggerLexV2Mod

import typingsJapgolly.awsLambda.anon.SlotElicitationStyle
import typingsJapgolly.awsLambda.anon.SlotToElicit
import typingsJapgolly.awsLambda.anon.SlotToElicitType
import typingsJapgolly.awsLambda.handlerMod.Callback
import typingsJapgolly.awsLambda.handlerMod.Handler
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type LexV2Callback = Callback[LexV2Result]

type LexV2DialogAction = (LevV2DialogActionWithoutSlot & SlotToElicit) | SlotToElicitType

type LexV2Handler = Handler[LexV2Event, LexV2Result]

type LexV2ResultDialogAction = (LevV2DialogActionWithoutSlot & SlotToElicit) | SlotElicitationStyle

type LexV2Slots = Record[String, LexV2Slot | Null]
