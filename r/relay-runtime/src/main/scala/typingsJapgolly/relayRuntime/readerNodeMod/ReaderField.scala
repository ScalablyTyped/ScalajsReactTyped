package typingsJapgolly.relayRuntime.readerNodeMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.relayRuntime.AnonFragmentName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.relayRuntime.readerNodeMod.ReaderScalarField
  - typingsJapgolly.relayRuntime.readerNodeMod.ReaderLinkedField
  - typingsJapgolly.relayRuntime.readerNodeMod.ReaderMatchField
*/
trait ReaderField extends ReaderSelection

object ReaderField {
  @scala.inline
  def ReaderScalarField(
    kind: String,
    name: String,
    alias: String = null,
    args: js.Array[ReaderArgument] = null,
    storageKey: String = null
  ): ReaderField = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (args != null) __obj.updateDynamic("args")(args.asInstanceOf[js.Any])
    if (storageKey != null) __obj.updateDynamic("storageKey")(storageKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReaderField]
  }
  @scala.inline
  def ReaderLinkedField(
    args: js.Array[ReaderArgument],
    kind: String,
    name: String,
    plural: Boolean,
    selections: js.Array[ReaderSelection],
    alias: String = null,
    concreteType: String = null,
    storageKey: String = null
  ): ReaderField = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], plural = plural.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (concreteType != null) __obj.updateDynamic("concreteType")(concreteType.asInstanceOf[js.Any])
    if (storageKey != null) __obj.updateDynamic("storageKey")(storageKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReaderField]
  }
  @scala.inline
  def ReaderMatchField(
    kind: String,
    matchesByType: StringDictionary[AnonFragmentName],
    name: String,
    alias: String = null,
    args: js.Array[ReaderArgument] = null,
    storageKey: String = null
  ): ReaderField = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], matchesByType = matchesByType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (args != null) __obj.updateDynamic("args")(args.asInstanceOf[js.Any])
    if (storageKey != null) __obj.updateDynamic("storageKey")(storageKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReaderField]
  }
}

