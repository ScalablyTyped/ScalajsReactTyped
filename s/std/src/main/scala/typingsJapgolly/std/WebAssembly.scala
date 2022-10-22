package typingsJapgolly.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object WebAssembly {
  
  type CompileError = js.Error
  
  /* Rewritten from type alias, can be one of: 
    - js.Function
    - typingsJapgolly.std.WebAssembly.Global
    - typingsJapgolly.std.WebAssembly.Memory
    - typingsJapgolly.std.WebAssembly.Table
  */
  type ExportValue = _ExportValue | js.Function
  
  type Exports = Record[java.lang.String, ExportValue]
  
  trait Global
    extends StObject
       with _ExportValue {
    
    /* standard dom */
    var value: Any
  }
  object Global {
    
    inline def apply(value: Any): Global = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Global]
    }
    
    extension [Self <: Global](x: Self) {
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait GlobalDescriptor extends StObject {
    
    /* standard dom */
    var mutable: js.UndefOr[scala.Boolean] = js.undefined
    
    /* standard dom */
    var value: ValueType
  }
  object GlobalDescriptor {
    
    inline def apply(value: ValueType): GlobalDescriptor = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[GlobalDescriptor]
    }
    
    extension [Self <: GlobalDescriptor](x: Self) {
      
      inline def setMutable(value: scala.Boolean): Self = StObject.set(x, "mutable", value.asInstanceOf[js.Any])
      
      inline def setMutableUndefined: Self = StObject.set(x, "mutable", js.undefined)
      
      inline def setValue(value: ValueType): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.std.stdStrings.function
    - typingsJapgolly.std.stdStrings.global
    - typingsJapgolly.std.stdStrings.memory
    - typingsJapgolly.std.stdStrings.table
  */
  trait ImportExportKind extends StObject
  object ImportExportKind {
    
    inline def function: typingsJapgolly.std.stdStrings.function = "function".asInstanceOf[typingsJapgolly.std.stdStrings.function]
    
    inline def global: typingsJapgolly.std.stdStrings.global = "global".asInstanceOf[typingsJapgolly.std.stdStrings.global]
    
    inline def memory: typingsJapgolly.std.stdStrings.memory = "memory".asInstanceOf[typingsJapgolly.std.stdStrings.memory]
    
    inline def table: typingsJapgolly.std.stdStrings.table = "table".asInstanceOf[typingsJapgolly.std.stdStrings.table]
  }
  
  type ImportValue = ExportValue | Double
  
  type Imports = Record[java.lang.String, ModuleImports]
  
  trait Instance extends StObject {
    
    /* standard dom */
    val exports: Exports
  }
  object Instance {
    
    inline def apply(exports: Exports): Instance = {
      val __obj = js.Dynamic.literal(exports = exports.asInstanceOf[js.Any])
      __obj.asInstanceOf[Instance]
    }
    
    extension [Self <: Instance](x: Self) {
      
      inline def setExports(value: Exports): Self = StObject.set(x, "exports", value.asInstanceOf[js.Any])
    }
  }
  
  type LinkError = js.Error
  
  trait Memory
    extends StObject
       with _ExportValue {
    
    /* standard dom */
    val buffer: js.typedarray.ArrayBuffer
    
    /* standard dom */
    def grow(delta: Double): Double
  }
  object Memory {
    
    inline def apply(buffer: js.typedarray.ArrayBuffer, grow: Double => Double): Memory = {
      val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], grow = js.Any.fromFunction1(grow))
      __obj.asInstanceOf[Memory]
    }
    
    extension [Self <: Memory](x: Self) {
      
      inline def setBuffer(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
      
      inline def setGrow(value: Double => Double): Self = StObject.set(x, "grow", js.Any.fromFunction1(value))
    }
  }
  
  trait MemoryDescriptor extends StObject {
    
    /* standard dom */
    var initial: Double
    
    /* standard dom */
    var maximum: js.UndefOr[Double] = js.undefined
    
    /* standard dom */
    var shared: js.UndefOr[scala.Boolean] = js.undefined
  }
  object MemoryDescriptor {
    
    inline def apply(initial: Double): MemoryDescriptor = {
      val __obj = js.Dynamic.literal(initial = initial.asInstanceOf[js.Any])
      __obj.asInstanceOf[MemoryDescriptor]
    }
    
    extension [Self <: MemoryDescriptor](x: Self) {
      
      inline def setInitial(value: Double): Self = StObject.set(x, "initial", value.asInstanceOf[js.Any])
      
      inline def setMaximum(value: Double): Self = StObject.set(x, "maximum", value.asInstanceOf[js.Any])
      
      inline def setMaximumUndefined: Self = StObject.set(x, "maximum", js.undefined)
      
      inline def setShared(value: scala.Boolean): Self = StObject.set(x, "shared", value.asInstanceOf[js.Any])
      
      inline def setSharedUndefined: Self = StObject.set(x, "shared", js.undefined)
    }
  }
  
  trait Module extends StObject
  
  trait ModuleExportDescriptor extends StObject {
    
    /* standard dom */
    var kind: ImportExportKind
    
    /* standard dom */
    var name: java.lang.String
  }
  object ModuleExportDescriptor {
    
    inline def apply(kind: ImportExportKind, name: java.lang.String): ModuleExportDescriptor = {
      val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ModuleExportDescriptor]
    }
    
    extension [Self <: ModuleExportDescriptor](x: Self) {
      
      inline def setKind(value: ImportExportKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setName(value: java.lang.String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait ModuleImportDescriptor extends StObject {
    
    /* standard dom */
    var kind: ImportExportKind
    
    /* standard dom */
    var module: java.lang.String
    
    /* standard dom */
    var name: java.lang.String
  }
  object ModuleImportDescriptor {
    
    inline def apply(kind: ImportExportKind, module: java.lang.String, name: java.lang.String): ModuleImportDescriptor = {
      val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], module = module.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ModuleImportDescriptor]
    }
    
    extension [Self <: ModuleImportDescriptor](x: Self) {
      
      inline def setKind(value: ImportExportKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setModule(value: java.lang.String): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
      
      inline def setName(value: java.lang.String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  type ModuleImports = Record[java.lang.String, ImportValue]
  
  type RuntimeError = js.Error
  
  @js.native
  trait Table
    extends StObject
       with _ExportValue {
    
    /* standard dom */
    def get(index: Double): Any = js.native
    
    /* standard dom */
    def grow(delta: Double): Double = js.native
    def grow(delta: Double, value: Any): Double = js.native
    
    /* standard dom */
    val length: Double = js.native
    
    /* standard dom */
    def set(index: Double): Unit = js.native
    def set(index: Double, value: Any): Unit = js.native
  }
  
  trait TableDescriptor extends StObject {
    
    /* standard dom */
    var element: TableKind
    
    /* standard dom */
    var initial: Double
    
    /* standard dom */
    var maximum: js.UndefOr[Double] = js.undefined
  }
  object TableDescriptor {
    
    inline def apply(element: TableKind, initial: Double): TableDescriptor = {
      val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], initial = initial.asInstanceOf[js.Any])
      __obj.asInstanceOf[TableDescriptor]
    }
    
    extension [Self <: TableDescriptor](x: Self) {
      
      inline def setElement(value: TableKind): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setInitial(value: Double): Self = StObject.set(x, "initial", value.asInstanceOf[js.Any])
      
      inline def setMaximum(value: Double): Self = StObject.set(x, "maximum", value.asInstanceOf[js.Any])
      
      inline def setMaximumUndefined: Self = StObject.set(x, "maximum", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.std.stdStrings.anyfunc
    - typingsJapgolly.std.stdStrings.externref
  */
  trait TableKind extends StObject
  object TableKind {
    
    inline def anyfunc: typingsJapgolly.std.stdStrings.anyfunc = "anyfunc".asInstanceOf[typingsJapgolly.std.stdStrings.anyfunc]
    
    inline def externref: typingsJapgolly.std.stdStrings.externref = "externref".asInstanceOf[typingsJapgolly.std.stdStrings.externref]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.std.stdStrings.anyfunc
    - typingsJapgolly.std.stdStrings.externref
    - typingsJapgolly.std.stdStrings.f32
    - typingsJapgolly.std.stdStrings.f64
    - typingsJapgolly.std.stdStrings.i32
    - typingsJapgolly.std.stdStrings.i64
    - typingsJapgolly.std.stdStrings.v128
  */
  trait ValueType extends StObject
  object ValueType {
    
    inline def anyfunc: typingsJapgolly.std.stdStrings.anyfunc = "anyfunc".asInstanceOf[typingsJapgolly.std.stdStrings.anyfunc]
    
    inline def externref: typingsJapgolly.std.stdStrings.externref = "externref".asInstanceOf[typingsJapgolly.std.stdStrings.externref]
    
    inline def f32: typingsJapgolly.std.stdStrings.f32 = "f32".asInstanceOf[typingsJapgolly.std.stdStrings.f32]
    
    inline def f64: typingsJapgolly.std.stdStrings.f64 = "f64".asInstanceOf[typingsJapgolly.std.stdStrings.f64]
    
    inline def i32: typingsJapgolly.std.stdStrings.i32 = "i32".asInstanceOf[typingsJapgolly.std.stdStrings.i32]
    
    inline def i64: typingsJapgolly.std.stdStrings.i64 = "i64".asInstanceOf[typingsJapgolly.std.stdStrings.i64]
    
    inline def v128: typingsJapgolly.std.stdStrings.v128 = "v128".asInstanceOf[typingsJapgolly.std.stdStrings.v128]
  }
  
  trait WebAssemblyInstantiatedSource extends StObject {
    
    /* standard dom */
    var instance: Instance
    
    /* standard dom */
    var module: Module
  }
  object WebAssemblyInstantiatedSource {
    
    inline def apply(instance: Instance, module: Module): WebAssemblyInstantiatedSource = {
      val __obj = js.Dynamic.literal(instance = instance.asInstanceOf[js.Any], module = module.asInstanceOf[js.Any])
      __obj.asInstanceOf[WebAssemblyInstantiatedSource]
    }
    
    extension [Self <: WebAssemblyInstantiatedSource](x: Self) {
      
      inline def setInstance(value: Instance): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
      
      inline def setModule(value: Module): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
    }
  }
  
  trait _ExportValue extends StObject
}
