package typingsJapgolly.tslint

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.tslint.completedDocsRuleMod.DocType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint/lib/rules/completed-docs/exclusionDescriptors", JSImport.Namespace)
@js.native
object exclusionDescriptorsMod extends js.Object {
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.tslint.blockExclusionMod.IBlockExclusionDescriptor
    - typingsJapgolly.tslint.classExclusionMod.IClassExclusionDescriptor
    - typingsJapgolly.tslint.tagExclusionMod.ITagExclusionDescriptor
  */
  trait ExclusionDescriptor extends js.Object
  
  type IExclusionDescriptors = StringDictionary[ExclusionDescriptor]
  type IInputExclusionDescriptors = DocType | StringDictionary[InputExclusionDescriptor]
  type InputExclusionDescriptor = Boolean | ExclusionDescriptor
}

