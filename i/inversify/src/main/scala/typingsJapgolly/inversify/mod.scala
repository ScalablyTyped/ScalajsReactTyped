package typingsJapgolly.inversify

import typingsJapgolly.inversify.injectMod.ServiceIdentifierOrFunc
import typingsJapgolly.inversify.interfacesMod.interfaces.Abstract
import typingsJapgolly.inversify.interfacesMod.interfaces.AsyncContainerModuleCallBack
import typingsJapgolly.inversify.interfacesMod.interfaces.ConstraintFunction
import typingsJapgolly.inversify.interfacesMod.interfaces.ContainerModuleCallBack
import typingsJapgolly.inversify.interfacesMod.interfaces.ContainerOptions
import typingsJapgolly.inversify.interfacesMod.interfaces.Newable
import typingsJapgolly.inversify.interfacesMod.interfaces.Request
import typingsJapgolly.inversify.interfacesMod.interfaces.ServiceIdentifier
import typingsJapgolly.inversify.inversifyStrings.designColonparamtypes
import typingsJapgolly.inversify.inversifyStrings.inject
import typingsJapgolly.inversify.inversifyStrings.inversifyColonparamtypes
import typingsJapgolly.inversify.inversifyStrings.inversifyColontagged
import typingsJapgolly.inversify.inversifyStrings.inversifyColontagged_props
import typingsJapgolly.inversify.inversifyStrings.multi_inject
import typingsJapgolly.inversify.inversifyStrings.name
import typingsJapgolly.inversify.inversifyStrings.named
import typingsJapgolly.inversify.inversifyStrings.optional
import typingsJapgolly.inversify.inversifyStrings.post_construct
import typingsJapgolly.inversify.inversifyStrings.unmanaged
import typingsJapgolly.std.ClassDecorator
import typingsJapgolly.std.MethodDecorator
import typingsJapgolly.std.ParameterDecorator
import typingsJapgolly.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("inversify", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class AsyncContainerModule protected ()
    extends typingsJapgolly.inversify.containerModuleMod.AsyncContainerModule {
    def this(registry: AsyncContainerModuleCallBack) = this()
  }
  
  @js.native
  class Container ()
    extends typingsJapgolly.inversify.containerMod.Container {
    def this(containerOptions: ContainerOptions) = this()
  }
  
  @js.native
  class ContainerModule protected ()
    extends typingsJapgolly.inversify.containerModuleMod.ContainerModule {
    def this(registry: ContainerModuleCallBack) = this()
  }
  
  @js.native
  class LazyServiceIdentifer[T] protected ()
    extends typingsJapgolly.inversify.injectMod.LazyServiceIdentifer[T] {
    def this(cb: js.Function0[ServiceIdentifier[T]]) = this()
  }
  
  @js.native
  class MetadataReader ()
    extends typingsJapgolly.inversify.metadataReaderMod.MetadataReader
  
  val BindingScopeEnum: typingsJapgolly.inversify.interfacesMod.interfaces.BindingScopeEnum = js.native
  val BindingTypeEnum: typingsJapgolly.inversify.interfacesMod.interfaces.BindingTypeEnum = js.native
  val TargetTypeEnum: typingsJapgolly.inversify.interfacesMod.interfaces.TargetTypeEnum = js.native
  def decorate(decorator: MethodDecorator | ParameterDecorator, target: js.Any): Unit = js.native
  def decorate(decorator: MethodDecorator | ParameterDecorator, target: js.Any, parameterIndex: String): Unit = js.native
  def decorate(decorator: MethodDecorator | ParameterDecorator, target: js.Any, parameterIndex: Double): Unit = js.native
  def decorate(decorator: ClassDecorator, target: js.Any): Unit = js.native
  def decorate(decorator: ClassDecorator, target: js.Any, parameterIndex: String): Unit = js.native
  def decorate(decorator: ClassDecorator, target: js.Any, parameterIndex: Double): Unit = js.native
  def getServiceIdentifierAsString(serviceIdentifier: ServiceIdentifier[_]): String = js.native
  def id(): Double = js.native
  def inject(serviceIdentifier: ServiceIdentifierOrFunc): js.Function3[/* target */ js.Any, /* targetKey */ String, /* index */ js.UndefOr[Double], Unit] = js.native
  def injectable(): js.Function1[/* target */ js.Any, _] = js.native
  def multiBindToService(container: typingsJapgolly.inversify.interfacesMod.interfaces.Container): js.Function1[
    /* service */ String | js.Symbol | Newable[_] | Abstract[_], 
    js.Function1[/* repeated */ String | js.Symbol | Newable[_] | Abstract[_], Unit]
  ] = js.native
  def multiInject(serviceIdentifier: ServiceIdentifier[_]): js.Function3[/* target */ js.Any, /* targetKey */ String, /* index */ js.UndefOr[Double], Unit] = js.native
  def named(name: String): js.Function3[/* target */ js.Any, /* targetKey */ String, /* index */ js.UndefOr[Double], Unit] = js.native
  def named(name: js.Symbol): js.Function3[/* target */ js.Any, /* targetKey */ String, /* index */ js.UndefOr[Double], Unit] = js.native
  def named(name: Double): js.Function3[/* target */ js.Any, /* targetKey */ String, /* index */ js.UndefOr[Double], Unit] = js.native
  def namedConstraint(value: js.Any): ConstraintFunction = js.native
  def optional(): js.Function3[/* target */ js.Any, /* targetKey */ String, /* index */ js.UndefOr[Double], Unit] = js.native
  def postConstruct(): js.Function3[
    /* target */ js.Any, 
    /* propertyKey */ String, 
    /* descriptor */ js.PropertyDescriptor, 
    Unit
  ] = js.native
  def tagged(metadataKey: String, metadataValue: js.Any): js.Function3[/* target */ js.Any, /* targetKey */ String, /* index */ js.UndefOr[Double], Unit] = js.native
  def tagged(metadataKey: js.Symbol, metadataValue: js.Any): js.Function3[/* target */ js.Any, /* targetKey */ String, /* index */ js.UndefOr[Double], Unit] = js.native
  def tagged(metadataKey: Double, metadataValue: js.Any): js.Function3[/* target */ js.Any, /* targetKey */ String, /* index */ js.UndefOr[Double], Unit] = js.native
  def taggedConstraint(key: PropertyKey): js.Function1[/* value */ js.Any, ConstraintFunction] = js.native
  def targetName(name: String): js.Function3[/* target */ js.Any, /* targetKey */ String, /* index */ Double, Unit] = js.native
  def traverseAncerstors(request: Request, constraint: ConstraintFunction): Boolean = js.native
  def typeConstraint(`type`: String): js.Function1[/* request */ Request | Null, Boolean] = js.native
  def typeConstraint(`type`: js.Function): js.Function1[/* request */ Request | Null, Boolean] = js.native
  def unmanaged(): js.Function3[/* target */ js.Any, /* targetKey */ String, /* index */ Double, Unit] = js.native
  /* static members */
  @js.native
  object Container extends js.Object {
    def merge(
      container1: typingsJapgolly.inversify.interfacesMod.interfaces.Container,
      container2: typingsJapgolly.inversify.interfacesMod.interfaces.Container
    ): typingsJapgolly.inversify.interfacesMod.interfaces.Container = js.native
  }
  
  @js.native
  object METADATA_KEY extends js.Object {
    val DESIGN_PARAM_TYPES: designColonparamtypes = js.native
    val INJECT_TAG: inject = js.native
    val MULTI_INJECT_TAG: multi_inject = js.native
    val NAMED_TAG: named = js.native
    val NAME_TAG: name = js.native
    val OPTIONAL_TAG: optional = js.native
    val PARAM_TYPES: inversifyColonparamtypes = js.native
    val POST_CONSTRUCT: post_construct = js.native
    val TAGGED: inversifyColontagged = js.native
    val TAGGED_PROP: inversifyColontagged_props = js.native
    val UNMANAGED_TAG: unmanaged = js.native
  }
  
}

