package typingsJapgolly.formatjsIcuMessageformatParser.typesMod

import typingsJapgolly.formatjsIcuMessageformatParser.typesMod.TYPE.plural
import typingsJapgolly.formatjsIcuMessageformatParser.typesMod.TYPE.pound
import typingsJapgolly.formatjsIcuMessageformatParser.typesMod.TYPE.select
import typingsJapgolly.formatjsIcuMessageformatParser.typesMod.TYPE.tag
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _MessageFormatElement extends StObject
object _MessageFormatElement {
  
  inline def PluralElement(
    offset: Double,
    options: Record[ValidPluralRule, PluralOrSelectOption],
    `type`: plural,
    value: String
  ): typingsJapgolly.formatjsIcuMessageformatParser.typesMod.PluralElement = {
    val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.formatjsIcuMessageformatParser.typesMod.PluralElement]
  }
  
  inline def PoundElement(`type`: pound): typingsJapgolly.formatjsIcuMessageformatParser.typesMod.PoundElement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.formatjsIcuMessageformatParser.typesMod.PoundElement]
  }
  
  inline def SelectElement(options: Record[String, PluralOrSelectOption], `type`: select, value: String): typingsJapgolly.formatjsIcuMessageformatParser.typesMod.SelectElement = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.formatjsIcuMessageformatParser.typesMod.SelectElement]
  }
  
  inline def TagElement(children: js.Array[MessageFormatElement], `type`: tag, value: String): typingsJapgolly.formatjsIcuMessageformatParser.typesMod.TagElement = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.formatjsIcuMessageformatParser.typesMod.TagElement]
  }
}
