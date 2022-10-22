package typingsJapgolly.jupyterlabSharedModels

import typingsJapgolly.jupyterlabNbformat.mod.IKernelspecMetadata
import typingsJapgolly.jupyterlabNbformat.mod.ILanguageInfoMetadata
import typingsJapgolly.jupyterlabNbformat.mod.INotebookMetadata
import typingsJapgolly.jupyterlabSharedModels.jupyterlabSharedModelsStrings.add
import typingsJapgolly.jupyterlabSharedModels.jupyterlabSharedModelsStrings.delete
import typingsJapgolly.jupyterlabSharedModels.jupyterlabSharedModelsStrings.update
import typingsJapgolly.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Action extends StObject {
    
    var action: add | update | delete
    
    var newValue: Any
    
    var oldValue: Any
  }
  object Action {
    
    inline def apply(action: add | update | delete, newValue: Any, oldValue: Any): Action = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], newValue = newValue.asInstanceOf[js.Any], oldValue = oldValue.asInstanceOf[js.Any])
      __obj.asInstanceOf[Action]
    }
    
    extension [Self <: Action](x: Self) {
      
      inline def setAction(value: add | update | delete): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setNewValue(value: Any): Self = StObject.set(x, "newValue", value.asInstanceOf[js.Any])
      
      inline def setOldValue(value: Any): Self = StObject.set(x, "oldValue", value.asInstanceOf[js.Any])
    }
  }
  
  trait Delete[T] extends StObject {
    
    var delete: js.UndefOr[Double] = js.undefined
    
    var insert: js.UndefOr[T] = js.undefined
    
    var retain: js.UndefOr[Double] = js.undefined
  }
  object Delete {
    
    inline def apply[T](): Delete[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Delete[T]]
    }
    
    extension [Self <: Delete[?], T](x: Self & Delete[T]) {
      
      inline def setDelete(value: Double): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
      
      inline def setDeleteUndefined: Self = StObject.set(x, "delete", js.undefined)
      
      inline def setInsert(value: T): Self = StObject.set(x, "insert", value.asInstanceOf[js.Any])
      
      inline def setInsertUndefined: Self = StObject.set(x, "insert", js.undefined)
      
      inline def setRetain(value: Double): Self = StObject.set(x, "retain", value.asInstanceOf[js.Any])
      
      inline def setRetainUndefined: Self = StObject.set(x, "retain", js.undefined)
    }
  }
  
  trait Name extends StObject {
    
    var name: String
    
    var newValue: Any
    
    var oldValue: Any
  }
  object Name {
    
    inline def apply(name: String, newValue: Any, oldValue: Any): Name = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], newValue = newValue.asInstanceOf[js.Any], oldValue = oldValue.asInstanceOf[js.Any])
      __obj.asInstanceOf[Name]
    }
    
    extension [Self <: Name](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNewValue(value: Any): Self = StObject.set(x, "newValue", value.asInstanceOf[js.Any])
      
      inline def setOldValue(value: Any): Self = StObject.set(x, "oldValue", value.asInstanceOf[js.Any])
    }
  }
  
  trait NewValue extends StObject {
    
    var newValue: js.UndefOr[Double] = js.undefined
    
    var oldValue: js.UndefOr[Double] = js.undefined
  }
  object NewValue {
    
    inline def apply(): NewValue = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NewValue]
    }
    
    extension [Self <: NewValue](x: Self) {
      
      inline def setNewValue(value: Double): Self = StObject.set(x, "newValue", value.asInstanceOf[js.Any])
      
      inline def setNewValueUndefined: Self = StObject.set(x, "newValue", js.undefined)
      
      inline def setOldValue(value: Double): Self = StObject.set(x, "oldValue", value.asInstanceOf[js.Any])
      
      inline def setOldValueUndefined: Self = StObject.set(x, "oldValue", js.undefined)
    }
  }
  
  trait NewValueOldValue extends StObject {
    
    var newValue: js.UndefOr[INotebookMetadata] = js.undefined
    
    var oldValue: INotebookMetadata
  }
  object NewValueOldValue {
    
    inline def apply(oldValue: INotebookMetadata): NewValueOldValue = {
      val __obj = js.Dynamic.literal(oldValue = oldValue.asInstanceOf[js.Any])
      __obj.asInstanceOf[NewValueOldValue]
    }
    
    extension [Self <: NewValueOldValue](x: Self) {
      
      inline def setNewValue(value: INotebookMetadata): Self = StObject.set(x, "newValue", value.asInstanceOf[js.Any])
      
      inline def setNewValueUndefined: Self = StObject.set(x, "newValue", js.undefined)
      
      inline def setOldValue(value: INotebookMetadata): Self = StObject.set(x, "oldValue", value.asInstanceOf[js.Any])
    }
  }
  
  trait OldValue[MetadataType] extends StObject {
    
    var newValue: js.UndefOr[Partial[MetadataType]] = js.undefined
    
    var oldValue: js.UndefOr[Partial[MetadataType]] = js.undefined
  }
  object OldValue {
    
    inline def apply[MetadataType](): OldValue[MetadataType] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OldValue[MetadataType]]
    }
    
    extension [Self <: OldValue[?], MetadataType](x: Self & OldValue[MetadataType]) {
      
      inline def setNewValue(value: Partial[MetadataType]): Self = StObject.set(x, "newValue", value.asInstanceOf[js.Any])
      
      inline def setNewValueUndefined: Self = StObject.set(x, "newValue", js.undefined)
      
      inline def setOldValue(value: Partial[MetadataType]): Self = StObject.set(x, "oldValue", value.asInstanceOf[js.Any])
      
      inline def setOldValueUndefined: Self = StObject.set(x, "oldValue", js.undefined)
    }
  }
  
  /* Inlined std.Partial<@jupyterlab/nbformat.@jupyterlab/nbformat.INotebookMetadata> */
  trait PartialINotebookMetadata extends StObject {
    
    var kernelspec: js.UndefOr[IKernelspecMetadata] = js.undefined
    
    var language_info: js.UndefOr[ILanguageInfoMetadata] = js.undefined
    
    var orig_nbformat: js.UndefOr[Double] = js.undefined
  }
  object PartialINotebookMetadata {
    
    inline def apply(): PartialINotebookMetadata = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialINotebookMetadata]
    }
    
    extension [Self <: PartialINotebookMetadata](x: Self) {
      
      inline def setKernelspec(value: IKernelspecMetadata): Self = StObject.set(x, "kernelspec", value.asInstanceOf[js.Any])
      
      inline def setKernelspecUndefined: Self = StObject.set(x, "kernelspec", js.undefined)
      
      inline def setLanguage_info(value: ILanguageInfoMetadata): Self = StObject.set(x, "language_info", value.asInstanceOf[js.Any])
      
      inline def setLanguage_infoUndefined: Self = StObject.set(x, "language_info", js.undefined)
      
      inline def setOrig_nbformat(value: Double): Self = StObject.set(x, "orig_nbformat", value.asInstanceOf[js.Any])
      
      inline def setOrig_nbformatUndefined: Self = StObject.set(x, "orig_nbformat", js.undefined)
    }
  }
}
