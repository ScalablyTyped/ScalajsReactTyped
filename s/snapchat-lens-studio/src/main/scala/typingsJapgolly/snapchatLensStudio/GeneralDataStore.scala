package typingsJapgolly.snapchatLensStudio

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Class for storing and retrieving data based on keys. Used by PersistentStorageSystem. For more information, see the Persistent Storage guide. */
trait GeneralDataStore
  extends StObject
     with ScriptObject {
  
  /** Clears all data stored in the General Data Store. */
  def clear(): Unit
  
  /** Returns a boolean value stored under the given key, or false if none exists. */
  def getBool(key: String): Boolean
  
  /** Returns a boolean array being stored under the given key, or an empty array if none exists. */
  def getBoolArray(key: String): js.Array[Boolean]
  
  /** Returns a double precision floating point number stored under the given key, or 0 if none exists. */
  def getDouble(key: String): Double
  
  /** Returns a floating point value stored under the given key, or 0 if none exists. */
  def getFloat(key: String): Double
  
  /** Returns a floating point array being stored under the given key, or an empty array if none exists. */
  def getFloatArray(key: String): js.Array[Double]
  
  /** Returns an integer number stored under the given key, or 0 if none exists. */
  def getInt(key: String): Double
  
  /** Returns an integer array being stored under the given key, or an empty array if none exists. */
  def getIntArray(key: String): js.Array[Double]
  
  /** Returns a mat2 value stored under the given key, or a default mat2 if none exists. */
  def getMat2(key: String): mat2
  
  /** Returns a mat2 array being stored under the given key, or an empty array if none exists. */
  def getMat2Array(key: String): js.Array[mat2]
  
  /** Stores a mat3 value under the given key. */
  def getMat3(key: String): mat3
  
  /** Returns a mat3 array being stored under the given key, or an empty array if none exists. */
  def getMat3Array(key: String): js.Array[mat3]
  
  /** Returns a mat4 value stored under the given key, or a default mat4 if none exists. */
  def getMat4(key: String): mat4
  
  /** Returns a mat4 array being stored under the given key, or an empty array if none exists. */
  def getMat4Array(key: String): js.Array[mat4]
  
  /** Returns the maximum total size  in: allowed, bytes, of all data stored in this General Data Store. */
  def getMaxSizeInBytes(): Double
  
  /** Returns a quat value stored under the given key, or a default quat if none exists. */
  def getQuat(key: String): quat
  
  /** Returns a quat array being stored under the given key, or an empty array if none exists. */
  def getQuatArray(key: String): js.Array[quat]
  
  /** If onStoreFull has been set, this method returns the current total  in: size, bytes, of all data stored in this General Data Store. Otherwise, 0 is returned. */
  def getSizeInBytes(): Double
  
  /** Returns a string value stored under the given key, or empty string if none exists. */
  def getString(key: String): String
  
  /** Returns a string array being stored under the given key, or an empty array if none exists. */
  def getStringArray(key: String): js.Array[String]
  
  /** Returns a vec2 value stored under the given key, or a default vec2 if none exists. */
  def getVec2(key: String): vec2
  
  /** Returns a vec2 array being stored under the given key, or an empty array if none exists. */
  def getVec2Array(key: String): js.Array[vec2]
  
  /** Returns a vec3 value stored under the given key, or a default vec3 if none exists. */
  def getVec3(key: String): vec3
  
  /** Returns a vec3 array being stored under the given key, or an empty array if none exists. */
  def getVec3Array(key: String): js.Array[vec3]
  
  /** Returns a vec4 value stored under the given key, or a default vec4 if none exists. */
  def getVec4(key: String): vec4
  
  /** Returns a vec4 array being stored under the given key, or an empty array if none exists. */
  def getVec4Array(key: String): js.Array[vec4]
  
  /** Returns true if a value is being stored under the given key. */
  def has(key: String): Boolean
  
  /**
    * Callback function that gets called when the allowed storage limit has been passed. The store won’t be saved if it is full, so if this is called make sure to remove data until back under the
    * limit.
    */
  def onStoreFull(): Unit
  
  /** Stores a boolean value under the given key. */
  def putBool(key: String, value: Boolean): Unit
  
  /** Stores a boolean array under the given key. */
  def putBoolArray(key: String, value: js.Array[Boolean]): Unit
  
  /** Stores a double precision floating point number under the given key. */
  def putDouble(key: String, value: Double): Unit
  
  /** Stores a floating point value under the given key. */
  def putFloat(key: String, value: Double): Unit
  
  /** Stores a floating point array under the given key. */
  def putFloatArray(key: String, value: js.Array[Double]): Unit
  
  /** Stores an integer number value under the given key. */
  def putInt(key: String, value: Double): Unit
  
  /** Stores an integer array under the given key. */
  def putIntArray(key: String, value: js.Array[Double]): Unit
  
  /** Stores a mat2 value under the given key. */
  def putMat2(key: String, value: mat2): Unit
  
  /** Stores a mat2 array under the given key. */
  def putMat2Array(key: String, value: js.Array[mat2]): Unit
  
  /** Stores a mat3 value under the given key. */
  def putMat3(key: String, value: mat3): Unit
  
  /** Stores a mat3 array under the given key. */
  def putMat3Array(key: String, value: js.Array[mat3]): Unit
  
  /** Stores a mat4 value under the given key. */
  def putMat4(key: String, value: mat4): Unit
  
  /** Stores a mat4 array under the given key. */
  def putMat4Array(key: String, value: js.Array[mat4]): Unit
  
  /** Stores a quat value under the given key. */
  def putQuat(key: String, value: quat): Unit
  
  /** Stores a quat array under the given key. */
  def putQuatArray(key: String, value: js.Array[quat]): Unit
  
  /** Stores a string value under the given key. */
  def putString(key: String, value: String): Unit
  
  /** Stores a string array under the given key. */
  def putStringArray(key: String, value: js.Array[String]): Unit
  
  /** Stores a vec2 value under the given key. */
  def putVec2(key: String, value: vec2): Unit
  
  /** Stores a vec2 array under the given key. */
  def putVec2Array(key: String, value: js.Array[vec2]): Unit
  
  /** Stores a vec3 value under the given key. */
  def putVec3(key: String, value: vec3): Unit
  
  /** Stores a vec3 array under the given key. */
  def putVec3Array(key: String, value: js.Array[vec3]): Unit
  
  /** Stores a vec4 value under the given key. */
  def putVec4(key: String, value: vec4): Unit
  
  /** Stores a vec4 array under the given key. */
  def putVec4Array(key: String, value: js.Array[vec4]): Unit
  
  /** Removes the value being stored under the given key. If no value exists under the key, nothing will happen. */
  def remove(key: String): Unit
}
object GeneralDataStore {
  
  inline def apply(
    clear: Callback,
    getBool: String => Boolean,
    getBoolArray: String => js.Array[Boolean],
    getDouble: String => Double,
    getFloat: String => Double,
    getFloatArray: String => js.Array[Double],
    getInt: String => Double,
    getIntArray: String => js.Array[Double],
    getMat2: String => mat2,
    getMat2Array: String => js.Array[mat2],
    getMat3: String => mat3,
    getMat3Array: String => js.Array[mat3],
    getMat4: String => mat4,
    getMat4Array: String => js.Array[mat4],
    getMaxSizeInBytes: CallbackTo[Double],
    getQuat: String => quat,
    getQuatArray: String => js.Array[quat],
    getSizeInBytes: CallbackTo[Double],
    getString: String => String,
    getStringArray: String => js.Array[String],
    getTypeName: CallbackTo[String],
    getVec2: String => vec2,
    getVec2Array: String => js.Array[vec2],
    getVec3: String => vec3,
    getVec3Array: String => js.Array[vec3],
    getVec4: String => vec4,
    getVec4Array: String => js.Array[vec4],
    has: String => Boolean,
    isOfType: String => Boolean,
    onStoreFull: Callback,
    putBool: (String, Boolean) => Callback,
    putBoolArray: (String, js.Array[Boolean]) => Callback,
    putDouble: (String, Double) => Callback,
    putFloat: (String, Double) => Callback,
    putFloatArray: (String, js.Array[Double]) => Callback,
    putInt: (String, Double) => Callback,
    putIntArray: (String, js.Array[Double]) => Callback,
    putMat2: (String, mat2) => Callback,
    putMat2Array: (String, js.Array[mat2]) => Callback,
    putMat3: (String, mat3) => Callback,
    putMat3Array: (String, js.Array[mat3]) => Callback,
    putMat4: (String, mat4) => Callback,
    putMat4Array: (String, js.Array[mat4]) => Callback,
    putQuat: (String, quat) => Callback,
    putQuatArray: (String, js.Array[quat]) => Callback,
    putString: (String, String) => Callback,
    putStringArray: (String, js.Array[String]) => Callback,
    putVec2: (String, vec2) => Callback,
    putVec2Array: (String, js.Array[vec2]) => Callback,
    putVec3: (String, vec3) => Callback,
    putVec3Array: (String, js.Array[vec3]) => Callback,
    putVec4: (String, vec4) => Callback,
    putVec4Array: (String, js.Array[vec4]) => Callback,
    remove: String => Callback
  ): GeneralDataStore = {
    val __obj = js.Dynamic.literal(clear = clear.toJsFn, getBool = js.Any.fromFunction1(getBool), getBoolArray = js.Any.fromFunction1(getBoolArray), getDouble = js.Any.fromFunction1(getDouble), getFloat = js.Any.fromFunction1(getFloat), getFloatArray = js.Any.fromFunction1(getFloatArray), getInt = js.Any.fromFunction1(getInt), getIntArray = js.Any.fromFunction1(getIntArray), getMat2 = js.Any.fromFunction1(getMat2), getMat2Array = js.Any.fromFunction1(getMat2Array), getMat3 = js.Any.fromFunction1(getMat3), getMat3Array = js.Any.fromFunction1(getMat3Array), getMat4 = js.Any.fromFunction1(getMat4), getMat4Array = js.Any.fromFunction1(getMat4Array), getMaxSizeInBytes = getMaxSizeInBytes.toJsFn, getQuat = js.Any.fromFunction1(getQuat), getQuatArray = js.Any.fromFunction1(getQuatArray), getSizeInBytes = getSizeInBytes.toJsFn, getString = js.Any.fromFunction1(getString), getStringArray = js.Any.fromFunction1(getStringArray), getTypeName = getTypeName.toJsFn, getVec2 = js.Any.fromFunction1(getVec2), getVec2Array = js.Any.fromFunction1(getVec2Array), getVec3 = js.Any.fromFunction1(getVec3), getVec3Array = js.Any.fromFunction1(getVec3Array), getVec4 = js.Any.fromFunction1(getVec4), getVec4Array = js.Any.fromFunction1(getVec4Array), has = js.Any.fromFunction1(has), isOfType = js.Any.fromFunction1(isOfType), onStoreFull = onStoreFull.toJsFn, putBool = js.Any.fromFunction2((t0: String, t1: Boolean) => (putBool(t0, t1)).runNow()), putBoolArray = js.Any.fromFunction2((t0: String, t1: js.Array[Boolean]) => (putBoolArray(t0, t1)).runNow()), putDouble = js.Any.fromFunction2((t0: String, t1: Double) => (putDouble(t0, t1)).runNow()), putFloat = js.Any.fromFunction2((t0: String, t1: Double) => (putFloat(t0, t1)).runNow()), putFloatArray = js.Any.fromFunction2((t0: String, t1: js.Array[Double]) => (putFloatArray(t0, t1)).runNow()), putInt = js.Any.fromFunction2((t0: String, t1: Double) => (putInt(t0, t1)).runNow()), putIntArray = js.Any.fromFunction2((t0: String, t1: js.Array[Double]) => (putIntArray(t0, t1)).runNow()), putMat2 = js.Any.fromFunction2((t0: String, t1: mat2) => (putMat2(t0, t1)).runNow()), putMat2Array = js.Any.fromFunction2((t0: String, t1: js.Array[mat2]) => (putMat2Array(t0, t1)).runNow()), putMat3 = js.Any.fromFunction2((t0: String, t1: mat3) => (putMat3(t0, t1)).runNow()), putMat3Array = js.Any.fromFunction2((t0: String, t1: js.Array[mat3]) => (putMat3Array(t0, t1)).runNow()), putMat4 = js.Any.fromFunction2((t0: String, t1: mat4) => (putMat4(t0, t1)).runNow()), putMat4Array = js.Any.fromFunction2((t0: String, t1: js.Array[mat4]) => (putMat4Array(t0, t1)).runNow()), putQuat = js.Any.fromFunction2((t0: String, t1: quat) => (putQuat(t0, t1)).runNow()), putQuatArray = js.Any.fromFunction2((t0: String, t1: js.Array[quat]) => (putQuatArray(t0, t1)).runNow()), putString = js.Any.fromFunction2((t0: String, t1: String) => (putString(t0, t1)).runNow()), putStringArray = js.Any.fromFunction2((t0: String, t1: js.Array[String]) => (putStringArray(t0, t1)).runNow()), putVec2 = js.Any.fromFunction2((t0: String, t1: vec2) => (putVec2(t0, t1)).runNow()), putVec2Array = js.Any.fromFunction2((t0: String, t1: js.Array[vec2]) => (putVec2Array(t0, t1)).runNow()), putVec3 = js.Any.fromFunction2((t0: String, t1: vec3) => (putVec3(t0, t1)).runNow()), putVec3Array = js.Any.fromFunction2((t0: String, t1: js.Array[vec3]) => (putVec3Array(t0, t1)).runNow()), putVec4 = js.Any.fromFunction2((t0: String, t1: vec4) => (putVec4(t0, t1)).runNow()), putVec4Array = js.Any.fromFunction2((t0: String, t1: js.Array[vec4]) => (putVec4Array(t0, t1)).runNow()), remove = js.Any.fromFunction1((t0: String) => remove(t0).runNow()))
    __obj.asInstanceOf[GeneralDataStore]
  }
  
  extension [Self <: GeneralDataStore](x: Self) {
    
    inline def setClear(value: Callback): Self = StObject.set(x, "clear", value.toJsFn)
    
    inline def setGetBool(value: String => Boolean): Self = StObject.set(x, "getBool", js.Any.fromFunction1(value))
    
    inline def setGetBoolArray(value: String => js.Array[Boolean]): Self = StObject.set(x, "getBoolArray", js.Any.fromFunction1(value))
    
    inline def setGetDouble(value: String => Double): Self = StObject.set(x, "getDouble", js.Any.fromFunction1(value))
    
    inline def setGetFloat(value: String => Double): Self = StObject.set(x, "getFloat", js.Any.fromFunction1(value))
    
    inline def setGetFloatArray(value: String => js.Array[Double]): Self = StObject.set(x, "getFloatArray", js.Any.fromFunction1(value))
    
    inline def setGetInt(value: String => Double): Self = StObject.set(x, "getInt", js.Any.fromFunction1(value))
    
    inline def setGetIntArray(value: String => js.Array[Double]): Self = StObject.set(x, "getIntArray", js.Any.fromFunction1(value))
    
    inline def setGetMat2(value: String => mat2): Self = StObject.set(x, "getMat2", js.Any.fromFunction1(value))
    
    inline def setGetMat2Array(value: String => js.Array[mat2]): Self = StObject.set(x, "getMat2Array", js.Any.fromFunction1(value))
    
    inline def setGetMat3(value: String => mat3): Self = StObject.set(x, "getMat3", js.Any.fromFunction1(value))
    
    inline def setGetMat3Array(value: String => js.Array[mat3]): Self = StObject.set(x, "getMat3Array", js.Any.fromFunction1(value))
    
    inline def setGetMat4(value: String => mat4): Self = StObject.set(x, "getMat4", js.Any.fromFunction1(value))
    
    inline def setGetMat4Array(value: String => js.Array[mat4]): Self = StObject.set(x, "getMat4Array", js.Any.fromFunction1(value))
    
    inline def setGetMaxSizeInBytes(value: CallbackTo[Double]): Self = StObject.set(x, "getMaxSizeInBytes", value.toJsFn)
    
    inline def setGetQuat(value: String => quat): Self = StObject.set(x, "getQuat", js.Any.fromFunction1(value))
    
    inline def setGetQuatArray(value: String => js.Array[quat]): Self = StObject.set(x, "getQuatArray", js.Any.fromFunction1(value))
    
    inline def setGetSizeInBytes(value: CallbackTo[Double]): Self = StObject.set(x, "getSizeInBytes", value.toJsFn)
    
    inline def setGetString(value: String => String): Self = StObject.set(x, "getString", js.Any.fromFunction1(value))
    
    inline def setGetStringArray(value: String => js.Array[String]): Self = StObject.set(x, "getStringArray", js.Any.fromFunction1(value))
    
    inline def setGetVec2(value: String => vec2): Self = StObject.set(x, "getVec2", js.Any.fromFunction1(value))
    
    inline def setGetVec2Array(value: String => js.Array[vec2]): Self = StObject.set(x, "getVec2Array", js.Any.fromFunction1(value))
    
    inline def setGetVec3(value: String => vec3): Self = StObject.set(x, "getVec3", js.Any.fromFunction1(value))
    
    inline def setGetVec3Array(value: String => js.Array[vec3]): Self = StObject.set(x, "getVec3Array", js.Any.fromFunction1(value))
    
    inline def setGetVec4(value: String => vec4): Self = StObject.set(x, "getVec4", js.Any.fromFunction1(value))
    
    inline def setGetVec4Array(value: String => js.Array[vec4]): Self = StObject.set(x, "getVec4Array", js.Any.fromFunction1(value))
    
    inline def setHas(value: String => Boolean): Self = StObject.set(x, "has", js.Any.fromFunction1(value))
    
    inline def setOnStoreFull(value: Callback): Self = StObject.set(x, "onStoreFull", value.toJsFn)
    
    inline def setPutBool(value: (String, Boolean) => Callback): Self = StObject.set(x, "putBool", js.Any.fromFunction2((t0: String, t1: Boolean) => (value(t0, t1)).runNow()))
    
    inline def setPutBoolArray(value: (String, js.Array[Boolean]) => Callback): Self = StObject.set(x, "putBoolArray", js.Any.fromFunction2((t0: String, t1: js.Array[Boolean]) => (value(t0, t1)).runNow()))
    
    inline def setPutDouble(value: (String, Double) => Callback): Self = StObject.set(x, "putDouble", js.Any.fromFunction2((t0: String, t1: Double) => (value(t0, t1)).runNow()))
    
    inline def setPutFloat(value: (String, Double) => Callback): Self = StObject.set(x, "putFloat", js.Any.fromFunction2((t0: String, t1: Double) => (value(t0, t1)).runNow()))
    
    inline def setPutFloatArray(value: (String, js.Array[Double]) => Callback): Self = StObject.set(x, "putFloatArray", js.Any.fromFunction2((t0: String, t1: js.Array[Double]) => (value(t0, t1)).runNow()))
    
    inline def setPutInt(value: (String, Double) => Callback): Self = StObject.set(x, "putInt", js.Any.fromFunction2((t0: String, t1: Double) => (value(t0, t1)).runNow()))
    
    inline def setPutIntArray(value: (String, js.Array[Double]) => Callback): Self = StObject.set(x, "putIntArray", js.Any.fromFunction2((t0: String, t1: js.Array[Double]) => (value(t0, t1)).runNow()))
    
    inline def setPutMat2(value: (String, mat2) => Callback): Self = StObject.set(x, "putMat2", js.Any.fromFunction2((t0: String, t1: mat2) => (value(t0, t1)).runNow()))
    
    inline def setPutMat2Array(value: (String, js.Array[mat2]) => Callback): Self = StObject.set(x, "putMat2Array", js.Any.fromFunction2((t0: String, t1: js.Array[mat2]) => (value(t0, t1)).runNow()))
    
    inline def setPutMat3(value: (String, mat3) => Callback): Self = StObject.set(x, "putMat3", js.Any.fromFunction2((t0: String, t1: mat3) => (value(t0, t1)).runNow()))
    
    inline def setPutMat3Array(value: (String, js.Array[mat3]) => Callback): Self = StObject.set(x, "putMat3Array", js.Any.fromFunction2((t0: String, t1: js.Array[mat3]) => (value(t0, t1)).runNow()))
    
    inline def setPutMat4(value: (String, mat4) => Callback): Self = StObject.set(x, "putMat4", js.Any.fromFunction2((t0: String, t1: mat4) => (value(t0, t1)).runNow()))
    
    inline def setPutMat4Array(value: (String, js.Array[mat4]) => Callback): Self = StObject.set(x, "putMat4Array", js.Any.fromFunction2((t0: String, t1: js.Array[mat4]) => (value(t0, t1)).runNow()))
    
    inline def setPutQuat(value: (String, quat) => Callback): Self = StObject.set(x, "putQuat", js.Any.fromFunction2((t0: String, t1: quat) => (value(t0, t1)).runNow()))
    
    inline def setPutQuatArray(value: (String, js.Array[quat]) => Callback): Self = StObject.set(x, "putQuatArray", js.Any.fromFunction2((t0: String, t1: js.Array[quat]) => (value(t0, t1)).runNow()))
    
    inline def setPutString(value: (String, String) => Callback): Self = StObject.set(x, "putString", js.Any.fromFunction2((t0: String, t1: String) => (value(t0, t1)).runNow()))
    
    inline def setPutStringArray(value: (String, js.Array[String]) => Callback): Self = StObject.set(x, "putStringArray", js.Any.fromFunction2((t0: String, t1: js.Array[String]) => (value(t0, t1)).runNow()))
    
    inline def setPutVec2(value: (String, vec2) => Callback): Self = StObject.set(x, "putVec2", js.Any.fromFunction2((t0: String, t1: vec2) => (value(t0, t1)).runNow()))
    
    inline def setPutVec2Array(value: (String, js.Array[vec2]) => Callback): Self = StObject.set(x, "putVec2Array", js.Any.fromFunction2((t0: String, t1: js.Array[vec2]) => (value(t0, t1)).runNow()))
    
    inline def setPutVec3(value: (String, vec3) => Callback): Self = StObject.set(x, "putVec3", js.Any.fromFunction2((t0: String, t1: vec3) => (value(t0, t1)).runNow()))
    
    inline def setPutVec3Array(value: (String, js.Array[vec3]) => Callback): Self = StObject.set(x, "putVec3Array", js.Any.fromFunction2((t0: String, t1: js.Array[vec3]) => (value(t0, t1)).runNow()))
    
    inline def setPutVec4(value: (String, vec4) => Callback): Self = StObject.set(x, "putVec4", js.Any.fromFunction2((t0: String, t1: vec4) => (value(t0, t1)).runNow()))
    
    inline def setPutVec4Array(value: (String, js.Array[vec4]) => Callback): Self = StObject.set(x, "putVec4Array", js.Any.fromFunction2((t0: String, t1: js.Array[vec4]) => (value(t0, t1)).runNow()))
    
    inline def setRemove(value: String => Callback): Self = StObject.set(x, "remove", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
