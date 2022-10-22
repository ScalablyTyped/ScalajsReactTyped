package typingsJapgolly.firebaseComponent

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.firebaseComponent.distEsmSrcComponentContainerMod.ComponentContainer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsmSrcTypesMod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.firebaseComponent.firebaseComponentStrings.PUBLIC
    - typingsJapgolly.firebaseComponent.firebaseComponentStrings.PRIVATE
    - typingsJapgolly.firebaseComponent.firebaseComponentStrings.VERSION
  */
  trait ComponentType extends StObject
  object ComponentType {
    
    inline def PRIVATE: typingsJapgolly.firebaseComponent.firebaseComponentStrings.PRIVATE = "PRIVATE".asInstanceOf[typingsJapgolly.firebaseComponent.firebaseComponentStrings.PRIVATE]
    
    inline def PUBLIC: typingsJapgolly.firebaseComponent.firebaseComponentStrings.PUBLIC = "PUBLIC".asInstanceOf[typingsJapgolly.firebaseComponent.firebaseComponentStrings.PUBLIC]
    
    inline def VERSION: typingsJapgolly.firebaseComponent.firebaseComponentStrings.VERSION = "VERSION".asInstanceOf[typingsJapgolly.firebaseComponent.firebaseComponentStrings.VERSION]
  }
  
  type Dictionary = StringDictionary[Any]
  
  type InitializeOptions = InstanceFactoryOptions
  
  type InstanceFactory[T /* <: Name */] = js.Function2[
    /* container */ ComponentContainer, 
    /* options */ InstanceFactoryOptions, 
    /* import warning: importer.ImportType#apply Failed type conversion: @firebase/component.@firebase/component/dist/esm/src/types.NameServiceMapping[T] */ js.Any
  ]
  
  trait InstanceFactoryOptions extends StObject {
    
    var instanceIdentifier: js.UndefOr[String] = js.undefined
    
    var options: js.UndefOr[js.Object] = js.undefined
  }
  object InstanceFactoryOptions {
    
    inline def apply(): InstanceFactoryOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InstanceFactoryOptions]
    }
    
    extension [Self <: InstanceFactoryOptions](x: Self) {
      
      inline def setInstanceIdentifier(value: String): Self = StObject.set(x, "instanceIdentifier", value.asInstanceOf[js.Any])
      
      inline def setInstanceIdentifierUndefined: Self = StObject.set(x, "instanceIdentifier", js.undefined)
      
      inline def setOptions(value: js.Object): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.firebaseComponent.firebaseComponentStrings.LAZY
    - typingsJapgolly.firebaseComponent.firebaseComponentStrings.EAGER
    - typingsJapgolly.firebaseComponent.firebaseComponentStrings.EXPLICIT
  */
  trait InstantiationMode extends StObject
  object InstantiationMode {
    
    inline def EAGER: typingsJapgolly.firebaseComponent.firebaseComponentStrings.EAGER = "EAGER".asInstanceOf[typingsJapgolly.firebaseComponent.firebaseComponentStrings.EAGER]
    
    inline def EXPLICIT: typingsJapgolly.firebaseComponent.firebaseComponentStrings.EXPLICIT = "EXPLICIT".asInstanceOf[typingsJapgolly.firebaseComponent.firebaseComponentStrings.EXPLICIT]
    
    inline def LAZY: typingsJapgolly.firebaseComponent.firebaseComponentStrings.LAZY = "LAZY".asInstanceOf[typingsJapgolly.firebaseComponent.firebaseComponentStrings.LAZY]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.firebaseComponent.firebaseComponentStrings.rocket
    - typingsJapgolly.firebaseComponent.firebaseComponentStrings.ship
    - typingsJapgolly.firebaseComponent.firebaseComponentStrings.fireball
    - typingsJapgolly.firebaseComponent.firebaseComponentStrings.test
    - typingsJapgolly.firebaseComponent.firebaseComponentStrings.badtest
  */
  trait Name extends StObject
  
  trait NameServiceMapping extends StObject
  
  type OnInitCallBack[T /* <: Name */] = js.Function2[
    /* import warning: importer.ImportType#apply Failed type conversion: @firebase/component.@firebase/component/dist/esm/src/types.NameServiceMapping[T] */ /* instance */ js.Any, 
    /* identifier */ String, 
    Unit
  ]
  
  /* Inlined @firebase/component.@firebase/component/dist/esm/src/types.NameServiceMapping[@firebase/component.@firebase/component/dist/esm/src/types.Name] */
  type Service = scala.Nothing
  
  type onInstanceCreatedCallback[T /* <: Name */] = js.Function3[
    /* container */ ComponentContainer, 
    /* instanceIdentifier */ String, 
    /* import warning: importer.ImportType#apply Failed type conversion: @firebase/component.@firebase/component/dist/esm/src/types.NameServiceMapping[T] */ /* instance */ js.Any, 
    Unit
  ]
}
