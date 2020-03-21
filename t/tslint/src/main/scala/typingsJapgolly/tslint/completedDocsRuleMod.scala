package typingsJapgolly.tslint

import typingsJapgolly.tslint.exclusionDescriptorsMod.IInputExclusionDescriptors
import typingsJapgolly.tslint.mod.Rules.AbstractRule
import typingsJapgolly.tslint.ruleMod.IRuleMetadata
import typingsJapgolly.tslint.tslintStrings.`enum-members`
import typingsJapgolly.tslint.tslintStrings.`private`
import typingsJapgolly.tslint.tslintStrings.`protected`
import typingsJapgolly.tslint.tslintStrings.all
import typingsJapgolly.tslint.tslintStrings.classes
import typingsJapgolly.tslint.tslintStrings.content
import typingsJapgolly.tslint.tslintStrings.enums
import typingsJapgolly.tslint.tslintStrings.existence
import typingsJapgolly.tslint.tslintStrings.exported
import typingsJapgolly.tslint.tslintStrings.functions
import typingsJapgolly.tslint.tslintStrings.instance
import typingsJapgolly.tslint.tslintStrings.interfaces
import typingsJapgolly.tslint.tslintStrings.internal
import typingsJapgolly.tslint.tslintStrings.locations
import typingsJapgolly.tslint.tslintStrings.methods
import typingsJapgolly.tslint.tslintStrings.namespaces
import typingsJapgolly.tslint.tslintStrings.overloads
import typingsJapgolly.tslint.tslintStrings.privacies
import typingsJapgolly.tslint.tslintStrings.properties
import typingsJapgolly.tslint.tslintStrings.public
import typingsJapgolly.tslint.tslintStrings.static
import typingsJapgolly.tslint.tslintStrings.tags
import typingsJapgolly.tslint.tslintStrings.types
import typingsJapgolly.tslint.tslintStrings.variables
import typingsJapgolly.tslint.tslintStrings.visibilities
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint/lib/rules/completedDocsRule", JSImport.Namespace)
@js.native
object completedDocsRuleMod extends js.Object {
  @js.native
  class Rule () extends AbstractRule {
    var getExclusionsMap: js.Any = js.native
  }
  
  trait _DocType extends js.Object
  
  trait _Location extends js.Object
  
  trait _Privacy extends js.Object
  
  trait _Visibility extends js.Object
  
  @JSName("ALL")
  val ALL_ : all = js.native
  val ARGUMENT_CLASSES: classes = js.native
  val ARGUMENT_ENUMS: enums = js.native
  val ARGUMENT_ENUM_MEMBERS: `enum-members` = js.native
  val ARGUMENT_FUNCTIONS: functions = js.native
  val ARGUMENT_INTERFACES: interfaces = js.native
  val ARGUMENT_METHODS: methods = js.native
  val ARGUMENT_NAMESPACES: namespaces = js.native
  val ARGUMENT_PROPERTIES: properties = js.native
  val ARGUMENT_TYPES: types = js.native
  val ARGUMENT_VARIABLES: variables = js.native
  val DESCRIPTOR_LOCATIONS: locations = js.native
  val DESCRIPTOR_OVERLOADS: overloads = js.native
  val DESCRIPTOR_PRIVACIES: privacies = js.native
  val DESCRIPTOR_TAGS: tags = js.native
  val DESCRIPTOR_VISIBILITIES: visibilities = js.native
  val LOCATION_INSTANCE: instance = js.native
  val LOCATION_STATIC: static = js.native
  val PRIVACY_PRIVATE: `private` = js.native
  val PRIVACY_PROTECTED: `protected` = js.native
  val PRIVACY_PUBLIC: public = js.native
  val TAGS_FOR_CONTENT: content = js.native
  val TAGS_FOR_EXISTENCE: existence = js.native
  val VISIBILITY_EXPORTED: exported = js.native
  val VISIBILITY_INTERNAL: internal = js.native
  /* static members */
  @js.native
  object Rule extends js.Object {
    var ARGUMENT_DESCRIPTOR_BLOCK: AnonPropertiesType = js.native
    var ARGUMENT_DESCRIPTOR_CLASS: AnonPropertiesAnonLocations = js.native
    var ARGUMENT_DESCRIPTOR_FUNCTION: AnonPropertiesAnonOverloads = js.native
    var ARGUMENT_DESCRIPTOR_METHOD: AnonPropertiesAnonPrivacies = js.native
    var FAILURE_STRING_EXIST: String = js.native
    var defaultArguments: IInputExclusionDescriptors = js.native
    var metadata: IRuleMetadata = js.native
  }
  
  type All = all
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.tslint.completedDocsRuleMod.All
    - typingsJapgolly.tslint.tslintStrings.classes
    - typingsJapgolly.tslint.tslintStrings.enums
    - typingsJapgolly.tslint.tslintStrings.`enum-members`
    - typingsJapgolly.tslint.tslintStrings.functions
    - typingsJapgolly.tslint.tslintStrings.interfaces
    - typingsJapgolly.tslint.tslintStrings.methods
    - typingsJapgolly.tslint.tslintStrings.namespaces
    - typingsJapgolly.tslint.tslintStrings.properties
    - typingsJapgolly.tslint.tslintStrings.types
    - typingsJapgolly.tslint.tslintStrings.variables
  */
  type DocType = _DocType | All
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.tslint.completedDocsRuleMod.All
    - typingsJapgolly.tslint.tslintStrings.instance
    - typingsJapgolly.tslint.tslintStrings.static
  */
  type Location = _Location | All
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.tslint.completedDocsRuleMod.All
    - typingsJapgolly.tslint.tslintStrings.`private`
    - typingsJapgolly.tslint.tslintStrings.`protected`
    - typingsJapgolly.tslint.tslintStrings.public
  */
  type Privacy = _Privacy | All
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.tslint.completedDocsRuleMod.All
    - typingsJapgolly.tslint.tslintStrings.exported
    - typingsJapgolly.tslint.tslintStrings.internal
  */
  type Visibility = _Visibility | All
}

