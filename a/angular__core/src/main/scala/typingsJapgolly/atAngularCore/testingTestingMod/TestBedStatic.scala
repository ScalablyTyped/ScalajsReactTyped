package typingsJapgolly.atAngularCore.testingTestingMod

import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.atAngularCore.Anon_Deps
import typingsJapgolly.atAngularCore.Anon_DepsUseFactory
import typingsJapgolly.atAngularCore.Anon_Providers
import typingsJapgolly.atAngularCore.Anon_UseValue
import typingsJapgolly.atAngularCore.atAngularCoreMod.Component
import typingsJapgolly.atAngularCore.atAngularCoreMod.Directive
import typingsJapgolly.atAngularCore.atAngularCoreMod.InjectFlags
import typingsJapgolly.atAngularCore.atAngularCoreMod.InjectionToken
import typingsJapgolly.atAngularCore.atAngularCoreMod.NgModule
import typingsJapgolly.atAngularCore.atAngularCoreMod.Pipe
import typingsJapgolly.atAngularCore.atAngularCoreMod.PlatformRef
import typingsJapgolly.atAngularCore.atAngularCoreMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestBedStatic
  extends Instantiable1[/* args (repeated) */ js.Any, TestBed] {
  /**
    * Compile components with a `templateUrl` for the test's NgModule.
    * It is necessary to call this function
    * as fetching urls is asynchronous.
    */
  def compileComponents(): js.Promise[_] = js.native
  /**
    * Allows overriding default compiler providers and settings
    * which are defined in test_injector.js
    */
  def configureCompiler(config: Anon_Providers): TestBedStatic = js.native
  /**
    * Allows overriding default providers, directives, pipes, modules of the test injector,
    * which are defined in test_injector.js
    */
  def configureTestingModule(moduleDef: TestModuleMetadata): TestBedStatic = js.native
  def createComponent[T](component: Type[T]): ComponentFixture[T] = js.native
  /**
    * deprecated from v8.0.0 use Type<T> or InjectionToken<T>
    * This does not use the deprecated jsdoc tag on purpose
    * because it renders all overloads as deprecated in TSLint
    * due to https://github.com/palantir/tslint/issues/4522.
    */
  def get(token: js.Any): js.Any = js.native
  def get(token: js.Any, notFoundValue: js.Any): js.Any = js.native
  def get[T](token: InjectionToken[T]): js.Any = js.native
  def get[T](token: InjectionToken[T], notFoundValue: T): js.Any = js.native
  def get[T](token: InjectionToken[T], notFoundValue: T, flags: InjectFlags): js.Any = js.native
  def get[T](token: Type[T]): js.Any = js.native
  def get[T](token: Type[T], notFoundValue: T): js.Any = js.native
  def get[T](token: Type[T], notFoundValue: T, flags: InjectFlags): js.Any = js.native
  def initTestEnvironment(ngModule: js.Array[Type[_]], platform: PlatformRef): TestBed = js.native
  def initTestEnvironment(ngModule: js.Array[Type[_]], platform: PlatformRef, aotSummaries: js.Function0[js.Array[_]]): TestBed = js.native
  def initTestEnvironment(ngModule: Type[_], platform: PlatformRef): TestBed = js.native
  def initTestEnvironment(ngModule: Type[_], platform: PlatformRef, aotSummaries: js.Function0[js.Array[_]]): TestBed = js.native
  def overrideComponent(component: Type[_], `override`: MetadataOverride[Component]): TestBedStatic = js.native
  def overrideDirective(directive: Type[_], `override`: MetadataOverride[Directive]): TestBedStatic = js.native
  def overrideModule(ngModule: Type[_], `override`: MetadataOverride[NgModule]): TestBedStatic = js.native
  def overridePipe(pipe: Type[_], `override`: MetadataOverride[Pipe]): TestBedStatic = js.native
  /**
    * Overwrites all providers for the given token with the given provider definition.
    *
    * Note: This works for JIT and AOTed components as well.
    */
  def overrideProvider(token: js.Any, provider: Anon_Deps): TestBedStatic = js.native
  def overrideProvider(token: js.Any, provider: Anon_DepsUseFactory): TestBedStatic = js.native
  def overrideProvider(token: js.Any, provider: Anon_UseValue): TestBedStatic = js.native
  def overrideTemplate(component: Type[_], template: String): TestBedStatic = js.native
  /**
    * Overrides the template of the given component, compiling the template
    * in the context of the TestingModule.
    *
    * Note: This works for JIT and AOTed components as well.
    */
  def overrideTemplateUsingTestingModule(component: Type[_], template: String): TestBedStatic = js.native
  /**
    * Reset the providers for the test injector.
    */
  def resetTestEnvironment(): Unit = js.native
  def resetTestingModule(): TestBedStatic = js.native
}

