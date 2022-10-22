package typingsJapgolly.typedoc.mod

import typingsJapgolly.typescript.mod.Program
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "Context")
@js.native
open class Context protected ()
  extends typingsJapgolly.typedoc.distLibConverterMod.Context {
  /**
    * Create a new Context instance.
    *
    * @param converter  The converter instance that has created the context.
    * @internal
    */
  def this(
    converter: typingsJapgolly.typedoc.distLibConverterConverterMod.Converter,
    programs: js.Array[Program],
    project: typingsJapgolly.typedoc.distLibModelsMod.ProjectReflection
  ) = this()
  def this(
    converter: typingsJapgolly.typedoc.distLibConverterConverterMod.Converter,
    programs: js.Array[Program],
    project: typingsJapgolly.typedoc.distLibModelsMod.ProjectReflection,
    scope: typingsJapgolly.typedoc.distLibModelsMod.Reflection
  ) = this()
}
