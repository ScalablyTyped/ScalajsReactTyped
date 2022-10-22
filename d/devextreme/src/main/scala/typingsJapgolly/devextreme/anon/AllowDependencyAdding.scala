package typingsJapgolly.devextreme.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AllowDependencyAdding extends StObject {
  
  /**
    * Specifies whether a user can add dependencies.
    */
  var allowDependencyAdding: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies whether a user can delete dependencies.
    */
  var allowDependencyDeleting: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies whether a user can add resources. tasks.
    */
  var allowResourceAdding: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies whether a user can delete resources.
    */
  var allowResourceDeleting: js.UndefOr[Boolean] = js.undefined
  
  /**
    * For internal use only.
    */
  var allowResourceUpdating: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies whether a user can add tasks.
    */
  var allowTaskAdding: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies whether a user can delete tasks.
    */
  var allowTaskDeleting: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies whether users can update a task&apos;s resources.
    */
  var allowTaskResourceUpdating: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies whether a user can update tasks.
    */
  var allowTaskUpdating: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies whether a user can edit tasks, resources and dependencies.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
}
object AllowDependencyAdding {
  
  inline def apply(): AllowDependencyAdding = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AllowDependencyAdding]
  }
  
  extension [Self <: AllowDependencyAdding](x: Self) {
    
    inline def setAllowDependencyAdding(value: Boolean): Self = StObject.set(x, "allowDependencyAdding", value.asInstanceOf[js.Any])
    
    inline def setAllowDependencyAddingUndefined: Self = StObject.set(x, "allowDependencyAdding", js.undefined)
    
    inline def setAllowDependencyDeleting(value: Boolean): Self = StObject.set(x, "allowDependencyDeleting", value.asInstanceOf[js.Any])
    
    inline def setAllowDependencyDeletingUndefined: Self = StObject.set(x, "allowDependencyDeleting", js.undefined)
    
    inline def setAllowResourceAdding(value: Boolean): Self = StObject.set(x, "allowResourceAdding", value.asInstanceOf[js.Any])
    
    inline def setAllowResourceAddingUndefined: Self = StObject.set(x, "allowResourceAdding", js.undefined)
    
    inline def setAllowResourceDeleting(value: Boolean): Self = StObject.set(x, "allowResourceDeleting", value.asInstanceOf[js.Any])
    
    inline def setAllowResourceDeletingUndefined: Self = StObject.set(x, "allowResourceDeleting", js.undefined)
    
    inline def setAllowResourceUpdating(value: Boolean): Self = StObject.set(x, "allowResourceUpdating", value.asInstanceOf[js.Any])
    
    inline def setAllowResourceUpdatingUndefined: Self = StObject.set(x, "allowResourceUpdating", js.undefined)
    
    inline def setAllowTaskAdding(value: Boolean): Self = StObject.set(x, "allowTaskAdding", value.asInstanceOf[js.Any])
    
    inline def setAllowTaskAddingUndefined: Self = StObject.set(x, "allowTaskAdding", js.undefined)
    
    inline def setAllowTaskDeleting(value: Boolean): Self = StObject.set(x, "allowTaskDeleting", value.asInstanceOf[js.Any])
    
    inline def setAllowTaskDeletingUndefined: Self = StObject.set(x, "allowTaskDeleting", js.undefined)
    
    inline def setAllowTaskResourceUpdating(value: Boolean): Self = StObject.set(x, "allowTaskResourceUpdating", value.asInstanceOf[js.Any])
    
    inline def setAllowTaskResourceUpdatingUndefined: Self = StObject.set(x, "allowTaskResourceUpdating", js.undefined)
    
    inline def setAllowTaskUpdating(value: Boolean): Self = StObject.set(x, "allowTaskUpdating", value.asInstanceOf[js.Any])
    
    inline def setAllowTaskUpdatingUndefined: Self = StObject.set(x, "allowTaskUpdating", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
  }
}
