package typingsJapgolly.typedoc.optionsOptionsMod

import typingsJapgolly.typedoc.applicationMod.Application
import typingsJapgolly.typedoc.componentMod.ChildableComponent
import typingsJapgolly.typedoc.optionsDeclarationMod.DeclarationOption
import typingsJapgolly.typedoc.optionsDeclarationMod.OptionDeclaration
import typingsJapgolly.typedoc.optionsDeclarationMod.ParameterScope
import typingsJapgolly.typescript.mod.CompilerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/utils/options/options", "Options")
@js.native
class Options () extends ChildableComponent[Application, OptionsComponent] {
  var compilerOptions: js.Any = js.native
  var declarations: js.Any = js.native
  var values: js.Any = js.native
  def addDeclaration(declaration: DeclarationOption): Unit = js.native
  def addDeclaration(declaration: OptionDeclaration): Unit = js.native
  def addDeclarations(declarations: js.Array[OptionDeclaration | DeclarationOption]): Unit = js.native
  def getCompilerOptions(): CompilerOptions = js.native
  def getDeclaration(name: String): js.UndefOr[OptionDeclaration] = js.native
  def getDeclarationsByScope(scope: ParameterScope): js.Array[OptionDeclaration] = js.native
  def getRawValues(): js.Any = js.native
  def getValue(name: String): js.Any = js.native
  def read(): OptionsReadResult = js.native
  def read(data: js.Any): OptionsReadResult = js.native
  def read(data: js.Any, mode: OptionsReadMode): OptionsReadResult = js.native
  def removeDeclaration(declaration: OptionDeclaration): Unit = js.native
  def removeDeclarationByName(name: String): Unit = js.native
  def setValue(name: String, value: js.Any): Unit = js.native
  def setValue(
    name: String,
    value: js.Any,
    errorCallback: js.Function2[/* format */ String, /* repeated */ String, Unit]
  ): Unit = js.native
  def setValue(name: OptionDeclaration, value: js.Any): Unit = js.native
  def setValue(
    name: OptionDeclaration,
    value: js.Any,
    errorCallback: js.Function2[/* format */ String, /* repeated */ String, Unit]
  ): Unit = js.native
  def setValues(obj: js.Object): Unit = js.native
  def setValues(obj: js.Object, prefix: String): Unit = js.native
  def setValues(
    obj: js.Object,
    prefix: String,
    errorCallback: js.Function2[/* format */ String, /* repeated */ String, Unit]
  ): Unit = js.native
}

