package typingsJapgolly.firebaseFirestore.distPackagesFirestoreDistIndexDotesm2017Mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @license
  * Copyright 2020 Google LLC
  *
  * Licensed under the Apache License, Version 2.0 (the "License");
  * you may not use this file except in compliance with the License.
  * You may obtain a copy of the License at
  *
  *   http://www.apache.org/licenses/LICENSE-2.0
  *
  * Unless required by applicable law or agreed to in writing, software
  * distributed under the License is distributed on an "AS IS" BASIS,
  * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
  * See the License for the specific language governing permissions and
  * limitations under the License.
  */
/**
  * @license
  * Copyright 2020 Google LLC
  *
  * Licensed under the Apache License, Version 2.0 (the "License");
  * you may not use this file except in compliance with the License.
  * You may obtain a copy of the License at
  *
  *   http://www.apache.org/licenses/LICENSE-2.0
  *
  * Unless required by applicable law or agreed to in writing, software
  * distributed under the License is distributed on an "AS IS" BASIS,
  * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
  * See the License for the specific language governing permissions and
  * limitations under the License.
  */
/**
  * An immutable object representing an array of bytes.
  */
trait th extends StObject {
  
  var _byteString: Any
  
  /**
    * Returns true if this `Bytes` object is equal to the provided one.
    *
    * @param other - The `Bytes` object to compare against.
    * @returns true if this `Bytes` object is equal to the provided one.
    */ def isEqual(t: Any): Any
  
  /**
    * Returns the underlying bytes as a Base64-encoded string.
    *
    * @returns The Base64-encoded string created from the `Bytes` object.
    */ def toBase64(): Any
  
  /**
    * Returns the underlying bytes in a new `Uint8Array`.
    *
    * @returns The Uint8Array created from the `Bytes` object.
    */ def toUint8Array(): Any
}
object th {
  
  inline def apply(_byteString: Any, isEqual: Any => Any, toBase64: CallbackTo[Any], toUint8Array: CallbackTo[Any]): th = {
    val __obj = js.Dynamic.literal(_byteString = _byteString.asInstanceOf[js.Any], isEqual = js.Any.fromFunction1(isEqual), toBase64 = toBase64.toJsFn, toUint8Array = toUint8Array.toJsFn)
    __obj.asInstanceOf[th]
  }
  
  extension [Self <: th](x: Self) {
    
    inline def setIsEqual(value: Any => Any): Self = StObject.set(x, "isEqual", js.Any.fromFunction1(value))
    
    inline def setToBase64(value: CallbackTo[Any]): Self = StObject.set(x, "toBase64", value.toJsFn)
    
    inline def setToUint8Array(value: CallbackTo[Any]): Self = StObject.set(x, "toUint8Array", value.toJsFn)
    
    inline def set_byteString(value: Any): Self = StObject.set(x, "_byteString", value.asInstanceOf[js.Any])
  }
}
