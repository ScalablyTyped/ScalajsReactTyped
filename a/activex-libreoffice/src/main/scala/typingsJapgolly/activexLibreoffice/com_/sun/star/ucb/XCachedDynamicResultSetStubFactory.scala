package typingsJapgolly.activexLibreoffice.com_.sun.star.ucb

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * creates a {@link CachedDynamicResultSetStub} and connects a non-remote optimized {@link DynamicResultSet} to a remote optimized {@link
  * CachedDynamicResultSet} .
  *
  * Pay attention to instantiate this helper on server side where your source {@link DynamicResultSet} was instantiated.
  *
  * Method {@link XCachedDynamicResultSetStubFactory.createCachedDynamicResultSetStub()} can be used to create a stub on server side.
  *
  * If you have instantiated a {@link CachedDynamicResultSet} on client side already, use method {@link connectToCache()} to connect your given {@link
  * DynamicResultSet} with this Cache.
  *
  * The needed cache on server side you can create using {@link XCachedDynamicResultSetFactory} .
  */
trait XCachedDynamicResultSetStubFactory
  extends StObject
     with XInterface {
  
  /**
    * If you have instantiated a {@link CachedDynamicResultSet} on client side already, use this to connect your given Source on server side to the
    * TargetCache.
    * @param Source is an instance of service {@link DynamicResultSet} .
    * @param TargetCache is an instance of service {@link CachedDynamicResultSet} .
    * @param SortingInfo can be an empty sequence. Otherwise, Source will be sorted according to the given sorting data.
    * @param CompareFactory will be ignored unless {@link SortingInfo} is not empty. Then the supplied factory will be used to instantiate objects used to com
    * @throws ListenerAlreadySetException if `Source` is already in use.
    * @throws AlreadyInitializedException if `TargetCache` already has been initialized.
    */
  def connectToCache(
    Source: XDynamicResultSet,
    TargetCache: XDynamicResultSet,
    SortingInfo: SeqEquiv[NumberedSortingInfo],
    CompareFactory: XAnyCompareFactory
  ): Unit
  
  /**
    * creates a remote optimizes {@link XDynamicResultSet} .
    * @param Source must be an instance of service {@link DynamicResultSet} .
    * @returns an instance of service {@link CachedDynamicResultSetStub} .
    */
  def createCachedDynamicResultSetStub(Source: XDynamicResultSet): XDynamicResultSet
}
object XCachedDynamicResultSetStubFactory {
  
  inline def apply(
    acquire: Callback,
    connectToCache: (XDynamicResultSet, XDynamicResultSet, SeqEquiv[NumberedSortingInfo], XAnyCompareFactory) => Callback,
    createCachedDynamicResultSetStub: XDynamicResultSet => XDynamicResultSet,
    queryInterface: `type` => Any,
    release: Callback
  ): XCachedDynamicResultSetStubFactory = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, connectToCache = js.Any.fromFunction4((t0: XDynamicResultSet, t1: XDynamicResultSet, t2: SeqEquiv[NumberedSortingInfo], t3: XAnyCompareFactory) => (connectToCache(t0, t1, t2, t3)).runNow()), createCachedDynamicResultSetStub = js.Any.fromFunction1(createCachedDynamicResultSetStub), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XCachedDynamicResultSetStubFactory]
  }
  
  extension [Self <: XCachedDynamicResultSetStubFactory](x: Self) {
    
    inline def setConnectToCache(
      value: (XDynamicResultSet, XDynamicResultSet, SeqEquiv[NumberedSortingInfo], XAnyCompareFactory) => Callback
    ): Self = StObject.set(x, "connectToCache", js.Any.fromFunction4((t0: XDynamicResultSet, t1: XDynamicResultSet, t2: SeqEquiv[NumberedSortingInfo], t3: XAnyCompareFactory) => (value(t0, t1, t2, t3)).runNow()))
    
    inline def setCreateCachedDynamicResultSetStub(value: XDynamicResultSet => XDynamicResultSet): Self = StObject.set(x, "createCachedDynamicResultSetStub", js.Any.fromFunction1(value))
  }
}
