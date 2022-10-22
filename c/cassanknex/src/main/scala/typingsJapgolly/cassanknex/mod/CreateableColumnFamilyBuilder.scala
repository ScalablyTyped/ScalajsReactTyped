package typingsJapgolly.cassanknex.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.cassanknex.cassanknexStrings.asc
import typingsJapgolly.cassanknex.cassanknexStrings.desc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateableColumnFamilyBuilder[T] extends StObject {
  
  def withCaching(): this.type
  
  def withClusteringOrderBy[K /* <: /* keyof T */ String */](value: K, direction: desc | asc): this.type
  
  def withCompaction(): this.type
  
  def withCompression(): this.type
}
object CreateableColumnFamilyBuilder {
  
  inline def apply[T](
    withCaching: CallbackTo[CreateableColumnFamilyBuilder[T]],
    withClusteringOrderBy: (Any, desc | asc) => CreateableColumnFamilyBuilder[T],
    withCompaction: CallbackTo[CreateableColumnFamilyBuilder[T]],
    withCompression: CallbackTo[CreateableColumnFamilyBuilder[T]]
  ): CreateableColumnFamilyBuilder[T] = {
    val __obj = js.Dynamic.literal(withCaching = withCaching.toJsFn, withClusteringOrderBy = js.Any.fromFunction2(withClusteringOrderBy), withCompaction = withCompaction.toJsFn, withCompression = withCompression.toJsFn)
    __obj.asInstanceOf[CreateableColumnFamilyBuilder[T]]
  }
  
  extension [Self <: CreateableColumnFamilyBuilder[?], T](x: Self & CreateableColumnFamilyBuilder[T]) {
    
    inline def setWithCaching(value: CallbackTo[CreateableColumnFamilyBuilder[T]]): Self = StObject.set(x, "withCaching", value.toJsFn)
    
    inline def setWithClusteringOrderBy(value: (Any, desc | asc) => CreateableColumnFamilyBuilder[T]): Self = StObject.set(x, "withClusteringOrderBy", js.Any.fromFunction2(value))
    
    inline def setWithCompaction(value: CallbackTo[CreateableColumnFamilyBuilder[T]]): Self = StObject.set(x, "withCompaction", value.toJsFn)
    
    inline def setWithCompression(value: CallbackTo[CreateableColumnFamilyBuilder[T]]): Self = StObject.set(x, "withCompression", value.toJsFn)
  }
}
