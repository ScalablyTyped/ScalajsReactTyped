package typingsJapgolly.classTransformer

import typingsJapgolly.classTransformer.classTransformOptionsMod.ClassTransformOptions
import typingsJapgolly.classTransformer.exposeExcludeOptionsMod.ExcludeOptions
import typingsJapgolly.classTransformer.exposeExcludeOptionsMod.ExposeOptions
import typingsJapgolly.classTransformer.exposeExcludeOptionsMod.TransformOptions
import typingsJapgolly.classTransformer.exposeExcludeOptionsMod.TypeHelpOptions
import typingsJapgolly.classTransformer.exposeExcludeOptionsMod.TypeOptions
import typingsJapgolly.classTransformer.transformOperationExecutorMod.TransformationType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("class-transformer/decorators", JSImport.Namespace)
@js.native
object decoratorsMod extends js.Object {
  def Exclude(): js.Function2[/* object */ js.Object | js.Function, /* propertyName */ js.UndefOr[String], Unit] = js.native
  def Exclude(options: ExcludeOptions): js.Function2[/* object */ js.Object | js.Function, /* propertyName */ js.UndefOr[String], Unit] = js.native
  def Expose(): js.Function2[/* object */ js.Object | js.Function, /* propertyName */ js.UndefOr[String], Unit] = js.native
  def Expose(options: ExposeOptions): js.Function2[/* object */ js.Object | js.Function, /* propertyName */ js.UndefOr[String], Unit] = js.native
  def Transform(
    transformFn: js.Function3[/* value */ js.Any, /* obj */ js.Any, /* transformationType */ TransformationType, _]
  ): js.Function2[/* target */ js.Any, /* key */ String, Unit] = js.native
  def Transform(
    transformFn: js.Function3[/* value */ js.Any, /* obj */ js.Any, /* transformationType */ TransformationType, _],
    options: TransformOptions
  ): js.Function2[/* target */ js.Any, /* key */ String, Unit] = js.native
  def TransformClassToClass(): js.Function = js.native
  def TransformClassToClass(params: ClassTransformOptions): js.Function = js.native
  def TransformClassToPlain(): js.Function = js.native
  def TransformClassToPlain(params: ClassTransformOptions): js.Function = js.native
  def TransformPlainToClass(classType: js.Any): js.Function = js.native
  def TransformPlainToClass(classType: js.Any, params: ClassTransformOptions): js.Function = js.native
  def Type(): js.Function2[/* target */ js.Any, /* key */ String, Unit] = js.native
  def Type(typeFunction: js.Function1[/* type */ js.UndefOr[TypeHelpOptions], js.Function]): js.Function2[/* target */ js.Any, /* key */ String, Unit] = js.native
  def Type(
    typeFunction: js.Function1[/* type */ js.UndefOr[TypeHelpOptions], js.Function],
    options: TypeOptions
  ): js.Function2[/* target */ js.Any, /* key */ String, Unit] = js.native
}

