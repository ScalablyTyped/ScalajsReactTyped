package typingsJapgolly.typescript

import typingsJapgolly.typescript.typescriptMod.CompletionsTriggerCharacter
import typingsJapgolly.typescript.typescriptMod.SignatureHelpRetriggerCharacter
import typingsJapgolly.typescript.typescriptMod.SignatureHelpTriggerCharacter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object typescriptStrings {
  @js.native
  sealed trait _quote extends CompletionsTriggerCharacter
  
  @js.native
  sealed trait `(`
    extends SignatureHelpRetriggerCharacter
       with SignatureHelpTriggerCharacter
  
  @js.native
  sealed trait `)` extends SignatureHelpRetriggerCharacter
  
  @js.native
  sealed trait `,`
    extends SignatureHelpRetriggerCharacter
       with SignatureHelpTriggerCharacter
  
  @js.native
  sealed trait `/` extends CompletionsTriggerCharacter
  
  @js.native
  sealed trait `0DOT8` extends js.Object
  
  @js.native
  sealed trait `3DOT7` extends js.Object
  
  @js.native
  sealed trait `<`
    extends CompletionsTriggerCharacter
       with SignatureHelpRetriggerCharacter
       with SignatureHelpTriggerCharacter
  
  @js.native
  sealed trait `@` extends CompletionsTriggerCharacter
  
  @js.native
  sealed trait BACKSLASH extends CompletionsTriggerCharacter
  
  @js.native
  sealed trait BACKTICK extends CompletionsTriggerCharacter
  
  @js.native
  sealed trait DOT extends CompletionsTriggerCharacter
  
  @js.native
  sealed trait JS extends js.Object
  
  @js.native
  sealed trait `action::invalidate` extends js.Object
  
  @js.native
  sealed trait `action::packageInstalled` extends js.Object
  
  @js.native
  sealed trait `action::set` extends js.Object
  
  @js.native
  sealed trait auto extends js.Object
  
  @js.native
  sealed trait camelCase extends js.Object
  
  @js.native
  sealed trait characterTyped extends js.Object
  
  @js.native
  sealed trait closeProject extends js.Object
  
  @js.native
  sealed trait discover extends js.Object
  
  @js.native
  sealed trait double extends js.Object
  
  @js.native
  sealed trait dts extends js.Object
  
  @js.native
  sealed trait `event::beginInstallTypes` extends js.Object
  
  @js.native
  sealed trait `event::endInstallTypes` extends js.Object
  
  @js.native
  sealed trait `event::initializationFailed` extends js.Object
  
  @js.native
  sealed trait `event::typesRegistry` extends js.Object
  
  @js.native
  sealed trait exact extends js.Object
  
  @js.native
  sealed trait file extends js.Object
  
  @js.native
  sealed trait index extends js.Object
  
  @js.native
  sealed trait installPackage extends js.Object
  
  @js.native
  sealed trait invoked extends js.Object
  
  @js.native
  sealed trait minimal extends js.Object
  
  @js.native
  sealed trait `non-relative` extends js.Object
  
  @js.native
  sealed trait prefix extends js.Object
  
  @js.native
  sealed trait relative extends js.Object
  
  @js.native
  sealed trait retrigger extends js.Object
  
  @js.native
  sealed trait single extends js.Object
  
  @js.native
  sealed trait substring extends js.Object
  
  @js.native
  sealed trait typesRegistry extends js.Object
  
  @scala.inline
  def _quote: _quote = "'".asInstanceOf[_quote]
  @scala.inline
  def `(`: `(` = "(".asInstanceOf[`(`]
  @scala.inline
  def `)`: `)` = ")".asInstanceOf[`)`]
  @scala.inline
  def `,`: `,` = ",".asInstanceOf[`,`]
  @scala.inline
  def `/`: `/` = "/".asInstanceOf[`/`]
  @scala.inline
  def `0DOT8`: `0DOT8` = "0.8".asInstanceOf[`0DOT8`]
  @scala.inline
  def `3DOT7`: `3DOT7` = "3.7".asInstanceOf[`3DOT7`]
  @scala.inline
  def `<`: `<` = "<".asInstanceOf[`<`]
  @scala.inline
  def `@`: `@` = "@".asInstanceOf[`@`]
  @scala.inline
  def BACKSLASH: BACKSLASH = "\"".asInstanceOf[BACKSLASH]
  @scala.inline
  def BACKTICK: BACKTICK = "`".asInstanceOf[BACKTICK]
  @scala.inline
  def DOT: DOT = ".".asInstanceOf[DOT]
  @scala.inline
  def JS: JS = "js".asInstanceOf[JS]
  @scala.inline
  def `action::invalidate`: `action::invalidate` = "action::invalidate".asInstanceOf[`action::invalidate`]
  @scala.inline
  def `action::packageInstalled`: `action::packageInstalled` = "action::packageInstalled".asInstanceOf[`action::packageInstalled`]
  @scala.inline
  def `action::set`: `action::set` = "action::set".asInstanceOf[`action::set`]
  @scala.inline
  def auto: auto = "auto".asInstanceOf[auto]
  @scala.inline
  def camelCase: camelCase = "camelCase".asInstanceOf[camelCase]
  @scala.inline
  def characterTyped: characterTyped = "characterTyped".asInstanceOf[characterTyped]
  @scala.inline
  def closeProject: closeProject = "closeProject".asInstanceOf[closeProject]
  @scala.inline
  def discover: discover = "discover".asInstanceOf[discover]
  @scala.inline
  def double: double = "double".asInstanceOf[double]
  @scala.inline
  def dts: dts = "dts".asInstanceOf[dts]
  @scala.inline
  def `event::beginInstallTypes`: `event::beginInstallTypes` = "event::beginInstallTypes".asInstanceOf[`event::beginInstallTypes`]
  @scala.inline
  def `event::endInstallTypes`: `event::endInstallTypes` = "event::endInstallTypes".asInstanceOf[`event::endInstallTypes`]
  @scala.inline
  def `event::initializationFailed`: `event::initializationFailed` = "event::initializationFailed".asInstanceOf[`event::initializationFailed`]
  @scala.inline
  def `event::typesRegistry`: `event::typesRegistry` = "event::typesRegistry".asInstanceOf[`event::typesRegistry`]
  @scala.inline
  def exact: exact = "exact".asInstanceOf[exact]
  @scala.inline
  def file: file = "file".asInstanceOf[file]
  @scala.inline
  def index: index = "index".asInstanceOf[index]
  @scala.inline
  def installPackage: installPackage = "installPackage".asInstanceOf[installPackage]
  @scala.inline
  def invoked: invoked = "invoked".asInstanceOf[invoked]
  @scala.inline
  def minimal: minimal = "minimal".asInstanceOf[minimal]
  @scala.inline
  def `non-relative`: `non-relative` = "non-relative".asInstanceOf[`non-relative`]
  @scala.inline
  def prefix: prefix = "prefix".asInstanceOf[prefix]
  @scala.inline
  def relative: relative = "relative".asInstanceOf[relative]
  @scala.inline
  def retrigger: retrigger = "retrigger".asInstanceOf[retrigger]
  @scala.inline
  def single: single = "single".asInstanceOf[single]
  @scala.inline
  def substring: substring = "substring".asInstanceOf[substring]
  @scala.inline
  def typesRegistry: typesRegistry = "typesRegistry".asInstanceOf[typesRegistry]
}

