package typingsJapgolly.activexLibreoffice.com_.sun.star.container

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.Pair
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides a default {@link XEnumerableMap} implementation
  *
  * For the keys put into the map using {@link XMap.put()} or {@link createImmutable()} , the following rules apply: A `VOID` key is not allowed.If the
  * key type is `BOOLEAN` , `CHAR` , `FLOAT` , `DOUBLE` , `STRING` , `TYPE` , or `UNSIGNED HYPER` , then only keys of exactly this type are accepted.If
  * the key type is `DOUBLE` or `FLOAT` , then `Double.NaN` respectively `Float.NaN` is not accepted as key.If the key type's class is
  * com::sun::star::uno::TypeClass::ENUM, then only keys of exactly this type are accepted.If the key type is any of `BYTE` , `SHORT` , `UNSIGNED SHORT` ,
  * `LONG` , `UNSIGNED LONG` , or `HYPER` , then all keys which can losslessly be converted to this type (possibly using widening conversions) are
  * accepted.If the key type is an interface type, then all key values denoting objects which can be queried for the given interface are accepted.All
  * other key types are rejected.
  *
  * For the values put into the map using {@link XMap.put()} or {@link createImmutable()} , the following rules apply: The `VOID` value will be accepted
  * to be put into the map.
  *
  * If the value type's class is com::sun::star::uno::TypeClass::ANY, any value will be accepted.If the value type is an interface type, then all values
  * denoting objects which can be queried for the given interface are accepted.If the value type's class is com::sun::star::uno::TypeClass::EXCEPTION or
  * com::sun::star::uno::TypeClass::STRUCT, then values whose type equals the value type, or is a sub class of the value type, are accepted.For all other
  * value types, only values whose type matches exactly are accepted.If the value type is `DOUBLE` or `FLOAT` , then `Double.NaN` respectively `Float.NaN`
  * is not accepted.
  *
  * The factory methods of the `XEnumerableMap` interface support both **isolated** and **non-isolated** enumerators. The latter one will be automatically
  * disposed when the map changes after enumerator creation, so every attempt to use them will result in a {@link com.sun.star.lang.DisposedException}
  * being thrown.
  * @see http://udk.openoffice.org/common/man/typesystem.html
  */
trait EnumerableMap
  extends StObject
     with XEnumerableMap {
  
  /**
    * creates an instance mapping from the given key type to the given value type
    * @param KeyType denotes the type of the keys in the to-be-created map
    * @param ValueType denotes the type of the values in the to-be-created map
    * @throws com::sun::star::beans::IllegalTypeException if KeyType or ValueType are unsupported types. For values, all type classes except com::sun::star::un
    */
  def create(KeyType: `type`, ValueType: `type`): Unit
  
  /**
    * creates an instance mapping from the given key type to the given value type
    *
    * The resulting map is immutable, so later alter operations on it will fail with a {@link com.sun.star.lang.NoSupportException} .
    * @param KeyType denotes the type of the keys in the to-be-created map
    * @param ValueType denotes the type of the values in the to-be-created map
    * @param Values denote the values contained in the to-be-created map
    * @throws com::sun::star::beans::IllegalTypeException if KeyType or ValueType are unsupported types. For values, all type classes except com::sun::star::un
    * @throws com::sun::star::lang::IllegalArgumentException if any of the given values or keys violates the [key rules]{@link url="#keyrules"} or [value rules
    */
  def createImmutable(KeyType: `type`, ValueType: `type`, Values: SeqEquiv[Pair[Any, Any]]): Unit
}
object EnumerableMap {
  
  inline def apply(
    ElementType: `type`,
    KeyType: `type`,
    ValueType: `type`,
    acquire: Callback,
    clear: Callback,
    containsKey: Any => Boolean,
    containsValue: Any => Boolean,
    create: (`type`, `type`) => Callback,
    createElementEnumeration: Boolean => XEnumeration,
    createImmutable: (`type`, `type`, SeqEquiv[Pair[Any, Any]]) => Callback,
    createKeyEnumeration: Boolean => XEnumeration,
    createValueEnumeration: Boolean => XEnumeration,
    get: Any => Any,
    getElementType: CallbackTo[`type`],
    hasElements: CallbackTo[Boolean],
    put: (Any, Any) => Any,
    queryInterface: `type` => Any,
    release: Callback,
    remove: Any => Any
  ): EnumerableMap = {
    val __obj = js.Dynamic.literal(ElementType = ElementType.asInstanceOf[js.Any], KeyType = KeyType.asInstanceOf[js.Any], ValueType = ValueType.asInstanceOf[js.Any], acquire = acquire.toJsFn, clear = clear.toJsFn, containsKey = js.Any.fromFunction1(containsKey), containsValue = js.Any.fromFunction1(containsValue), create = js.Any.fromFunction2((t0: `type`, t1: `type`) => (create(t0, t1)).runNow()), createElementEnumeration = js.Any.fromFunction1(createElementEnumeration), createImmutable = js.Any.fromFunction3((t0: `type`, t1: `type`, t2: SeqEquiv[Pair[Any, Any]]) => (createImmutable(t0, t1, t2)).runNow()), createKeyEnumeration = js.Any.fromFunction1(createKeyEnumeration), createValueEnumeration = js.Any.fromFunction1(createValueEnumeration), get = js.Any.fromFunction1(get), getElementType = getElementType.toJsFn, hasElements = hasElements.toJsFn, put = js.Any.fromFunction2(put), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, remove = js.Any.fromFunction1(remove))
    __obj.asInstanceOf[EnumerableMap]
  }
  
  extension [Self <: EnumerableMap](x: Self) {
    
    inline def setCreate(value: (`type`, `type`) => Callback): Self = StObject.set(x, "create", js.Any.fromFunction2((t0: `type`, t1: `type`) => (value(t0, t1)).runNow()))
    
    inline def setCreateImmutable(value: (`type`, `type`, SeqEquiv[Pair[Any, Any]]) => Callback): Self = StObject.set(x, "createImmutable", js.Any.fromFunction3((t0: `type`, t1: `type`, t2: SeqEquiv[Pair[Any, Any]]) => (value(t0, t1, t2)).runNow()))
  }
}
