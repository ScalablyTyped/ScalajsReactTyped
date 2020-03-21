package typingsJapgolly.relayRuntime.normalizationNodeMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.relayRuntime.AnonFragmentName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typingsJapgolly.relayRuntime.normalizationNodeMod.NormalizationSelection because Already inherited */ trait NormalizationMatchField extends NormalizationField {
   // 'MatchField';
  val alias: js.UndefOr[String | Null] = js.undefined
  val args: js.Array[NormalizationArgument]
  val kind: String
  val matchesByType: StringDictionary[AnonFragmentName]
  val name: String
  val storageKey: js.UndefOr[String | Null] = js.undefined
}

object NormalizationMatchField {
  @scala.inline
  def apply(
    args: js.Array[NormalizationArgument],
    kind: String,
    matchesByType: StringDictionary[AnonFragmentName],
    name: String,
    alias: String = null,
    storageKey: String = null
  ): NormalizationMatchField = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], matchesByType = matchesByType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (storageKey != null) __obj.updateDynamic("storageKey")(storageKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[NormalizationMatchField]
  }
}

