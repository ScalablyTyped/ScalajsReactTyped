package typingsJapgolly.ionicCore.distTypesComponentsMod.Components

import typingsJapgolly.ionicCore.distTypesComponentsMod.global.HTMLIonAccordionElement
import typingsJapgolly.ionicCore.ionicCoreStrings.compact
import typingsJapgolly.ionicCore.ionicCoreStrings.inset
import typingsJapgolly.ionicCore.ionicCoreStrings.ios
import typingsJapgolly.ionicCore.ionicCoreStrings.md
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IonAccordionGroup extends StObject {
  
  /**
    * If `true`, all accordions inside of the accordion group will animate when expanding or collapsing.
    */
  var animated: Boolean = js.native
  
  /**
    * If `true`, the accordion group cannot be interacted with.
    */
  var disabled: Boolean = js.native
  
  /**
    * Describes the expansion behavior for each accordion. Possible values are `"compact"` and `"inset"`. Defaults to `"compact"`.
    */
  var expand: compact | inset = js.native
  
  def getAccordions(): js.Promise[js.Array[HTMLIonAccordionElement]] = js.native
  
  /**
    * The mode determines which platform styles to use.
    */
  var mode: js.UndefOr[ios | md] = js.native
  
  /**
    * If `true`, the accordion group can have multiple accordion components expanded at the same time.
    */
  var multiple: js.UndefOr[Boolean] = js.native
  
  /**
    * If `true`, the accordion group cannot be interacted with, but does not alter the opacity.
    */
  var readonly: Boolean = js.native
  
  def requestAccordionToggle(accordionValue: String, accordionExpand: Boolean): js.Promise[Unit] = js.native
  def requestAccordionToggle(accordionValue: Unit, accordionExpand: Boolean): js.Promise[Unit] = js.native
  
  /**
    * The value of the accordion group.
    */
  var value: js.UndefOr[String | js.Array[String] | Null] = js.native
}
