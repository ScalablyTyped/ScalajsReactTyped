package typingsJapgolly.angularCore.testingMod

import typingsJapgolly.angularCore.AnonDeps
import typingsJapgolly.angularCore.AnonProviders
import typingsJapgolly.angularCore.AnonUseValue
import typingsJapgolly.angularCore.mod.Component
import typingsJapgolly.angularCore.mod.Directive
import typingsJapgolly.angularCore.mod.InjectFlags
import typingsJapgolly.angularCore.mod.InjectionToken
import typingsJapgolly.angularCore.mod.NgModule
import typingsJapgolly.angularCore.mod.Pipe
import typingsJapgolly.angularCore.mod.PlatformRef
import typingsJapgolly.angularCore.mod.Type
import typingsJapgolly.angularCore.testingTestingMod.MetadataOverride
import typingsJapgolly.angularCore.testingTestingMod.TestBedStatic
import typingsJapgolly.angularCore.testingTestingMod.TestModuleMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/core/testing", "\u0275angular_packages_core_testing_testing_b")
@js.native
class ɵangularPackagesCoreTestingTestingB ()
  extends typingsJapgolly.angularCore.testingTestingMod.ɵangularPackagesCoreTestingTestingB

/* static members */
@JSImport("@angular/core/testing", "\u0275angular_packages_core_testing_testing_b")
@js.native
object ɵangularPackagesCoreTestingTestingB extends js.Object {
  /**
    * Compile components with a `templateUrl` for the test's NgModule.
    * It is necessary to call this function
    * as fetching urls is asynchronous.
    */
  def compileComponents(): js.Promise[_] = js.native
  def configureCompiler(config: AnonProviders): TestBedStatic = js.native
  /**
    * Allows overriding default providers, directives, pipes, modules of the test injector,
    * which are defined in test_injector.js
    */
  def configureTestingModule(moduleDef: TestModuleMetadata): TestBedStatic = js.native
  def createComponent[T](component: Type[T]): typingsJapgolly.angularCore.testingTestingMod.ComponentFixture[T] = js.native
  /**
    * @deprecated from v8.0.0 use Type<T> or InjectionToken<T>
    */
  def get(token: js.Any): js.Any = js.native
  def get(token: js.Any, notFoundValue: js.Any): js.Any = js.native
  def get[T](token: InjectionToken[T]): js.Any = js.native
  def get[T](token: InjectionToken[T], notFoundValue: T): js.Any = js.native
  def get[T](token: InjectionToken[T], notFoundValue: T, flags: InjectFlags): js.Any = js.native
  def get[T](token: Type[T]): js.Any = js.native
  def get[T](token: Type[T], notFoundValue: T): js.Any = js.native
  def get[T](token: Type[T], notFoundValue: T, flags: InjectFlags): js.Any = js.native
  def initTestEnvironment(ngModule: js.Array[Type[_]], platform: PlatformRef): typingsJapgolly.angularCore.testingTestingMod.TestBed = js.native
  def initTestEnvironment(ngModule: js.Array[Type[_]], platform: PlatformRef, aotSummaries: js.Function0[js.Array[_]]): typingsJapgolly.angularCore.testingTestingMod.TestBed = js.native
  /**
    * Initialize the environment for testing with a compiler factory, a PlatformRef, and an
    * angular module. These are common to every test in the suite.
    *
    * This may only be called once, to set up the common providers for the current test
    * suite on the current platform. If you absolutely need to change the providers,
    * first use `resetTestEnvironment`.
    *
    * Test modules and platforms for individual platforms are available from
    * '@angular/<platform_name>/testing'.
    *
    * @publicApi
    */
  def initTestEnvironment(ngModule: Type[_], platform: PlatformRef): typingsJapgolly.angularCore.testingTestingMod.TestBed = js.native
  def initTestEnvironment(ngModule: Type[_], platform: PlatformRef, aotSummaries: js.Function0[js.Array[_]]): typingsJapgolly.angularCore.testingTestingMod.TestBed = js.native
  def overrideComponent(component: Type[_], `override`: MetadataOverride[Component]): TestBedStatic = js.native
  def overrideDirective(directive: Type[_], `override`: MetadataOverride[Directive]): TestBedStatic = js.native
  def overrideModule(ngModule: Type[_], `override`: MetadataOverride[NgModule]): TestBedStatic = js.native
  def overridePipe(pipe: Type[_], `override`: MetadataOverride[Pipe]): TestBedStatic = js.native
  def overrideProvider(token: js.Any, provider: AnonDeps): TestBedStatic = js.native
  def overrideProvider(token: js.Any, provider: AnonUseValue): TestBedStatic = js.native
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
    *
    * @publicApi
    */
  def resetTestEnvironment(): Unit = js.native
  def resetTestingModule(): TestBedStatic = js.native
}

