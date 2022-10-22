package typingsJapgolly.babylonjs

import japgolly.scalajs.react.Callback
import typingsJapgolly.babylonjs.deviceInputInputDevicesDeviceEnumsMod.DeviceType
import typingsJapgolly.babylonjs.deviceInputInputDevicesDeviceSourceMod.DeviceSource
import typingsJapgolly.babylonjs.deviceInputInputInterfacesMod.IDeviceInputSystem
import typingsJapgolly.babylonjs.enginesEngineMod.Engine
import typingsJapgolly.babylonjs.eventsDeviceInputEventsMod.IUIEvent
import typingsJapgolly.babylonjs.miscObservableMod.Observable
import typingsJapgolly.babylonjs.sceneMod.IDisposable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deviceInputInternalDeviceSourceManagerMod {
  
  @JSImport("babylonjs/DeviceInput/internalDeviceSourceManager", "InternalDeviceSourceManager")
  @js.native
  open class InternalDeviceSourceManager protected ()
    extends StObject
       with IDisposable {
    def this(engine: Engine) = this()
    
    val _deviceInputSystem: IDeviceInputSystem = js.native
    
    /* private */ val _devices: Any = js.native
    
    var _refCount: Double = js.native
    
    /* private */ val _registeredManagers: Any = js.native
    
    /**
      * Releases all held resources
      */
    /* CompleteClass */
    override def dispose(): Unit = js.native
    
    def registerManager(manager: IObservableManager): Unit = js.native
    
    def unregisterManager(manager: IObservableManager): Unit = js.native
  }
  
  type DeviceSourceType = Distribute[DeviceType]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends babylonjs.babylonjs/DeviceInput/InputDevices/deviceEnums.DeviceType ? babylonjs.babylonjs/DeviceInput/InputDevices/deviceSource.DeviceSource<T> : never
    }}}
    */
  @js.native
  trait Distribute[T] extends StObject
  
  trait IObservableManager extends StObject {
    
    def _addDevice(deviceSource: DeviceSource[DeviceType]): Unit
    
    def _onInputChanged(deviceType: DeviceType, deviceSlot: Double, eventData: IUIEvent): Unit
    
    def _removeDevice(deviceType: DeviceType, deviceSlot: Double): Unit
    
    var onDeviceConnectedObservable: Observable[DeviceSourceType]
    
    var onDeviceDisconnectedObservable: Observable[DeviceSourceType]
  }
  object IObservableManager {
    
    inline def apply(
      _addDevice: DeviceSource[DeviceType] => Callback,
      _onInputChanged: (DeviceType, Double, IUIEvent) => Callback,
      _removeDevice: (DeviceType, Double) => Callback,
      onDeviceConnectedObservable: Observable[DeviceSourceType],
      onDeviceDisconnectedObservable: Observable[DeviceSourceType]
    ): IObservableManager = {
      val __obj = js.Dynamic.literal(_addDevice = js.Any.fromFunction1((t0: DeviceSource[DeviceType]) => _addDevice(t0).runNow()), _onInputChanged = js.Any.fromFunction3((t0: DeviceType, t1: Double, t2: IUIEvent) => (_onInputChanged(t0, t1, t2)).runNow()), _removeDevice = js.Any.fromFunction2((t0: DeviceType, t1: Double) => (_removeDevice(t0, t1)).runNow()), onDeviceConnectedObservable = onDeviceConnectedObservable.asInstanceOf[js.Any], onDeviceDisconnectedObservable = onDeviceDisconnectedObservable.asInstanceOf[js.Any])
      __obj.asInstanceOf[IObservableManager]
    }
    
    extension [Self <: IObservableManager](x: Self) {
      
      inline def setOnDeviceConnectedObservable(value: Observable[DeviceSourceType]): Self = StObject.set(x, "onDeviceConnectedObservable", value.asInstanceOf[js.Any])
      
      inline def setOnDeviceDisconnectedObservable(value: Observable[DeviceSourceType]): Self = StObject.set(x, "onDeviceDisconnectedObservable", value.asInstanceOf[js.Any])
      
      inline def set_addDevice(value: DeviceSource[DeviceType] => Callback): Self = StObject.set(x, "_addDevice", js.Any.fromFunction1((t0: DeviceSource[DeviceType]) => value(t0).runNow()))
      
      inline def set_onInputChanged(value: (DeviceType, Double, IUIEvent) => Callback): Self = StObject.set(x, "_onInputChanged", js.Any.fromFunction3((t0: DeviceType, t1: Double, t2: IUIEvent) => (value(t0, t1, t2)).runNow()))
      
      inline def set_removeDevice(value: (DeviceType, Double) => Callback): Self = StObject.set(x, "_removeDevice", js.Any.fromFunction2((t0: DeviceType, t1: Double) => (value(t0, t1)).runNow()))
    }
  }
  
  /* augmented module */
  object babylonjsEnginesEngineAugmentingMod {
    
    trait Engine extends StObject {
      
      /** @internal */
      var _deviceSourceManager: js.UndefOr[InternalDeviceSourceManager] = js.undefined
    }
    object Engine {
      
      inline def apply(): typingsJapgolly.babylonjs.deviceInputInternalDeviceSourceManagerMod.babylonjsEnginesEngineAugmentingMod.Engine = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typingsJapgolly.babylonjs.deviceInputInternalDeviceSourceManagerMod.babylonjsEnginesEngineAugmentingMod.Engine]
      }
      
      extension [Self <: typingsJapgolly.babylonjs.deviceInputInternalDeviceSourceManagerMod.babylonjsEnginesEngineAugmentingMod.Engine](x: Self) {
        
        inline def set_deviceSourceManager(value: InternalDeviceSourceManager): Self = StObject.set(x, "_deviceSourceManager", value.asInstanceOf[js.Any])
        
        inline def set_deviceSourceManagerUndefined: Self = StObject.set(x, "_deviceSourceManager", js.undefined)
      }
    }
  }
}
