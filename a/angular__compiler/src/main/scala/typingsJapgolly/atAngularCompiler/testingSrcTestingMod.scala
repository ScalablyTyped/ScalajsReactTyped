package typingsJapgolly.atAngularCompiler

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.atAngularCompiler.atAngularCompilerMod.CompileReflector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/testing/src/testing", JSImport.Namespace)
@js.native
object testingSrcTestingMod extends js.Object {
  @js.native
  class MockDirectiveResolver protected ()
    extends typingsJapgolly.atAngularCompiler.testingSrcDirectiveUnderscoreResolverUnderscoreMockMod.MockDirectiveResolver {
    def this(reflector: CompileReflector) = this()
  }
  
  @js.native
  class MockNgModuleResolver protected ()
    extends typingsJapgolly.atAngularCompiler.testingSrcNgUnderscoreModuleUnderscoreResolverUnderscoreMockMod.MockNgModuleResolver {
    def this(reflector: CompileReflector) = this()
  }
  
  @js.native
  class MockPipeResolver protected ()
    extends typingsJapgolly.atAngularCompiler.testingSrcPipeUnderscoreResolverUnderscoreMockMod.MockPipeResolver {
    def this(refector: CompileReflector) = this()
  }
  
  @js.native
  class MockResourceLoader ()
    extends typingsJapgolly.atAngularCompiler.testingSrcResourceUnderscoreLoaderUnderscoreMockMod.MockResourceLoader
  
  @js.native
  class MockSchemaRegistry protected ()
    extends typingsJapgolly.atAngularCompiler.testingSrcSchemaUnderscoreRegistryUnderscoreMockMod.MockSchemaRegistry {
    def this(
      existingProperties: StringDictionary[Boolean],
      attrPropMapping: StringDictionary[String],
      existingElements: StringDictionary[Boolean],
      invalidProperties: js.Array[String],
      invalidAttributes: js.Array[String]
    ) = this()
  }
  
}

