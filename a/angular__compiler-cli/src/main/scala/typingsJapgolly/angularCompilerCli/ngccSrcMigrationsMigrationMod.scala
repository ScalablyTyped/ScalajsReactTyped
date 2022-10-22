package typingsJapgolly.angularCompilerCli

import typingsJapgolly.angularCompilerCli.ngccSrcHostNgccHostMod.NgccReflectionHost
import typingsJapgolly.angularCompilerCli.srcNgtscMetadataSrcApiMod.MetadataReader
import typingsJapgolly.angularCompilerCli.srcNgtscPartialEvaluatorMod.PartialEvaluator
import typingsJapgolly.angularCompilerCli.srcNgtscReflectionSrcHostMod.ClassDeclaration
import typingsJapgolly.angularCompilerCli.srcNgtscReflectionSrcHostMod.DeclarationNode
import typingsJapgolly.angularCompilerCli.srcNgtscReflectionSrcHostMod.Decorator
import typingsJapgolly.angularCompilerCli.srcNgtscTransformSrcApiMod.HandlerFlags
import typingsJapgolly.typescript.mod.Diagnostic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ngccSrcMigrationsMigrationMod {
  
  trait Migration extends StObject {
    
    @JSName("apply")
    def apply(clazz: ClassDeclaration[DeclarationNode], host: MigrationHost): Diagnostic | Null
  }
  object Migration {
    
    inline def apply(apply: (ClassDeclaration[DeclarationNode], MigrationHost) => Diagnostic | Null): Migration = {
      val __obj = js.Dynamic.literal(apply = js.Any.fromFunction2(apply))
      __obj.asInstanceOf[Migration]
    }
    
    extension [Self <: Migration](x: Self) {
      
      inline def setApply(value: (ClassDeclaration[DeclarationNode], MigrationHost) => Diagnostic | Null): Self = StObject.set(x, "apply", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait MigrationHost extends StObject {
    
    /** Enables expressions to be statically evaluated in the context of the program. */
    val evaluator: PartialEvaluator = js.native
    
    /**
      * Retrieves all decorators that are associated with the class, including synthetic decorators
      * that have been injected before.
      * @param clazz the class for which all decorators are retrieved.
      * @returns the list of the decorators, or null if the class was not decorated.
      */
    def getAllDecorators(clazz: ClassDeclaration[DeclarationNode]): js.Array[Decorator] | Null = js.native
    
    /**
      * Associate a new synthesized decorator, which did not appear in the original source, with a
      * given class.
      * @param clazz the class to receive the new decorator.
      * @param decorator the decorator to inject.
      * @param flags optional bitwise flag to influence the compilation of the decorator.
      */
    def injectSyntheticDecorator(clazz: ClassDeclaration[DeclarationNode], decorator: Decorator): Unit = js.native
    def injectSyntheticDecorator(clazz: ClassDeclaration[DeclarationNode], decorator: Decorator, flags: HandlerFlags): Unit = js.native
    
    /**
      * Determines whether the provided class in within scope of the entry-point that is currently
      * being compiled.
      * @param clazz the class for which to determine whether it is within the current entry-point.
      * @returns true if the file is part of the compiled entry-point, false otherwise.
      */
    def isInScope(clazz: ClassDeclaration[DeclarationNode]): Boolean = js.native
    
    /** Provides access to the decorator information associated with classes. */
    val metadata: MetadataReader = js.native
    
    /** Provides access to navigate the AST in a format-agnostic manner. */
    val reflectionHost: NgccReflectionHost = js.native
  }
}
