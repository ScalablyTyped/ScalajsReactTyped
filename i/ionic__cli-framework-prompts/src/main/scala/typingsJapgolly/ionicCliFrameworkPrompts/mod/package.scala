package typingsJapgolly.ionicCliFrameworkPrompts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Inquirer = typingsJapgolly.inquirer.mod.Inquirer
  type PromptType = typingsJapgolly.ionicCliFrameworkPrompts.mod.PromptTypeConfirm | typingsJapgolly.ionicCliFrameworkPrompts.mod.PromptTypeCheckbox | typingsJapgolly.ionicCliFrameworkPrompts.mod.PromptTypeOther
  type PromptTypeCheckbox = typingsJapgolly.ionicCliFrameworkPrompts.ionicCliFrameworkPromptsStrings.checkbox
  type PromptTypeConfirm = typingsJapgolly.ionicCliFrameworkPrompts.ionicCliFrameworkPromptsStrings.confirm
  type PromptValue = typingsJapgolly.ionicCliFrameworkPrompts.mod.PromptValueConfirm | typingsJapgolly.ionicCliFrameworkPrompts.mod.PromptValueCheckbox | typingsJapgolly.ionicCliFrameworkPrompts.mod.PromptValueOther
  type PromptValueCheckbox = js.Array[java.lang.String]
  type PromptValueConfirm = scala.Boolean
  type PromptValueOther = java.lang.String
  type Question = typingsJapgolly.inquirer.mod.Question[typingsJapgolly.inquirer.mod.Answers]
  type Separator = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_inquirer.objects.Separator */ js.Any
}
