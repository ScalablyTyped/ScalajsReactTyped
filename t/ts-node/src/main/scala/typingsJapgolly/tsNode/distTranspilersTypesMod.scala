package typingsJapgolly.tsNode

import typingsJapgolly.tsNode.anon.PickServiceExtractconfigo
import typingsJapgolly.typescript.mod.Diagnostic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTranspilersTypesMod {
  
  trait CreateTranspilerOptions extends StObject {
    
    var service: PickServiceExtractconfigo
  }
  object CreateTranspilerOptions {
    
    inline def apply(service: PickServiceExtractconfigo): CreateTranspilerOptions = {
      val __obj = js.Dynamic.literal(service = service.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateTranspilerOptions]
    }
    
    extension [Self <: CreateTranspilerOptions](x: Self) {
      
      inline def setService(value: PickServiceExtractconfigo): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    }
  }
  
  trait TranspileOptions extends StObject {
    
    var fileName: String
  }
  object TranspileOptions {
    
    inline def apply(fileName: String): TranspileOptions = {
      val __obj = js.Dynamic.literal(fileName = fileName.asInstanceOf[js.Any])
      __obj.asInstanceOf[TranspileOptions]
    }
    
    extension [Self <: TranspileOptions](x: Self) {
      
      inline def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    }
  }
  
  trait TranspileOutput extends StObject {
    
    var diagnostics: js.UndefOr[js.Array[Diagnostic]] = js.undefined
    
    var outputText: String
    
    var sourceMapText: js.UndefOr[String] = js.undefined
  }
  object TranspileOutput {
    
    inline def apply(outputText: String): TranspileOutput = {
      val __obj = js.Dynamic.literal(outputText = outputText.asInstanceOf[js.Any])
      __obj.asInstanceOf[TranspileOutput]
    }
    
    extension [Self <: TranspileOutput](x: Self) {
      
      inline def setDiagnostics(value: js.Array[Diagnostic]): Self = StObject.set(x, "diagnostics", value.asInstanceOf[js.Any])
      
      inline def setDiagnosticsUndefined: Self = StObject.set(x, "diagnostics", js.undefined)
      
      inline def setDiagnosticsVarargs(value: Diagnostic*): Self = StObject.set(x, "diagnostics", js.Array(value*))
      
      inline def setOutputText(value: String): Self = StObject.set(x, "outputText", value.asInstanceOf[js.Any])
      
      inline def setSourceMapText(value: String): Self = StObject.set(x, "sourceMapText", value.asInstanceOf[js.Any])
      
      inline def setSourceMapTextUndefined: Self = StObject.set(x, "sourceMapText", js.undefined)
    }
  }
  
  trait Transpiler extends StObject {
    
    def transpile(input: String, options: TranspileOptions): TranspileOutput
  }
  object Transpiler {
    
    inline def apply(transpile: (String, TranspileOptions) => TranspileOutput): Transpiler = {
      val __obj = js.Dynamic.literal(transpile = js.Any.fromFunction2(transpile))
      __obj.asInstanceOf[Transpiler]
    }
    
    extension [Self <: Transpiler](x: Self) {
      
      inline def setTranspile(value: (String, TranspileOptions) => TranspileOutput): Self = StObject.set(x, "transpile", js.Any.fromFunction2(value))
    }
  }
  
  type TranspilerFactory = js.Function1[/* options */ CreateTranspilerOptions, Transpiler]
  
  trait TranspilerModule extends StObject {
    
    def create(options: CreateTranspilerOptions): Transpiler
    @JSName("create")
    var create_Original: TranspilerFactory
  }
  object TranspilerModule {
    
    inline def apply(create: /* options */ CreateTranspilerOptions => Transpiler): TranspilerModule = {
      val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create))
      __obj.asInstanceOf[TranspilerModule]
    }
    
    extension [Self <: TranspilerModule](x: Self) {
      
      inline def setCreate(value: /* options */ CreateTranspilerOptions => Transpiler): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
    }
  }
}
