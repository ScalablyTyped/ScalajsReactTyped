package typingsJapgolly.bootstrapFilestyle

import typingsJapgolly.bootstrapFilestyle.bootstrapFilestyleStrings.buttonBefore
import typingsJapgolly.bootstrapFilestyle.bootstrapFilestyleStrings.buttonName
import typingsJapgolly.bootstrapFilestyle.bootstrapFilestyleStrings.buttonText
import typingsJapgolly.bootstrapFilestyle.bootstrapFilestyleStrings.clear
import typingsJapgolly.bootstrapFilestyle.bootstrapFilestyleStrings.destroy
import typingsJapgolly.bootstrapFilestyle.bootstrapFilestyleStrings.disabled
import typingsJapgolly.bootstrapFilestyle.bootstrapFilestyleStrings.htmlIcon
import typingsJapgolly.bootstrapFilestyle.bootstrapFilestyleStrings.htmlInput
import typingsJapgolly.bootstrapFilestyle.bootstrapFilestyleStrings.icon
import typingsJapgolly.bootstrapFilestyle.bootstrapFilestyleStrings.iconName
import typingsJapgolly.bootstrapFilestyle.bootstrapFilestyleStrings.input
import typingsJapgolly.bootstrapFilestyle.bootstrapFilestyleStrings.placeholder
import typingsJapgolly.bootstrapFilestyle.bootstrapFilestyleStrings.pushNameFiles
import typingsJapgolly.bootstrapFilestyle.bootstrapFilestyleStrings.size
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQuery extends StObject {
  
  def filestyle(): JQuery = js.native
  def filestyle(method: clear | destroy | htmlIcon | htmlInput | pushNameFiles): JQuery = js.native
  def filestyle(method: size | placeholder | buttonText | buttonName | iconName, value: String): JQuery = js.native
  def filestyle(method: disabled | buttonBefore | icon | input, value: Boolean): JQuery = js.native
  def filestyle(options: FilestyleOptions): JQuery = js.native
}
