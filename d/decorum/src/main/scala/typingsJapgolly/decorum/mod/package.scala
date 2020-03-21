package typingsJapgolly.decorum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type IMessageHandlerMap = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.decorum.mod.MessageHandler[js.Any]]
  type MessageHandler[TValidator /* <: typingsJapgolly.decorum.mod.BaseValidator */] = js.Function2[
    /* opts */ typingsJapgolly.decorum.mod.IMessageOpts, 
    /* validator */ TValidator, 
    java.lang.String
  ]
  type ValidationDefinitions = org.scalablytyped.runtime.StringDictionary[js.Array[typingsJapgolly.std.PropertyDecorator]]
}
