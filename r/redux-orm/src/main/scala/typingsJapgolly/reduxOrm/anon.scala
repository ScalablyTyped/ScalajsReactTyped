package typingsJapgolly.reduxOrm

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.Instantiable0
import typingsJapgolly.reduxOrm.modelMod.AnyModel
import typingsJapgolly.reduxOrm.modelMod.IdOrModelLike
import typingsJapgolly.reduxOrm.modelMod.IdType
import typingsJapgolly.reduxOrm.modelMod.Model
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait GetId[M /* <: Model[Instantiable0[AnyModel], Any] */]
    extends StObject
       with IdOrModelLike[M] {
    
    def getId(): IdType[M]
  }
  object GetId {
    
    inline def apply[M /* <: Model[Instantiable0[AnyModel], Any] */](getId: CallbackTo[IdType[M]]): GetId[M] = {
      val __obj = js.Dynamic.literal(getId = getId.toJsFn)
      __obj.asInstanceOf[GetId[M]]
    }
    
    extension [Self <: GetId[?], M /* <: Model[Instantiable0[AnyModel], Any] */](x: Self & GetId[M]) {
      
      inline def setGetId(value: CallbackTo[IdType[M]]): Self = StObject.set(x, "getId", value.toJsFn)
    }
  }
  
  trait TypeofQuerySet extends StObject {
    
    /**
      * Register custom method on a `QuerySet` class specification.
      * QuerySet class may be attached to a {@link Model} class via {@link Model#querySetClass}
      *
      * @param methodName - name of a method to be available on specific QuerySet class instances
      *
      * @example:
      * class CustomQuerySet extends QuerySet<Book> {
      *     static currentYear = 2019
      *     unreleased(): QuerySet<Book> {
      *         return this.filter(book => book.releaseYear > CustomQuerySet.currentYear);
      *     }
      * }
      * CustomQuerySet.addSharedMethod('unreleased');
      * // assign specific QuerySet to a Model class
      * Book.querySetClass = typeof CustomQuerySet;
      * // register models
      * const schema = {Book };
      * const orm = new ORM<typeof schema>();
      * orm.register(Book);
      * const session = orm.session(orm.getEmptyState());
      * // use shared method
      * const unreleased = customQs.unreleased();
      */
    def addSharedMethod(methodName: String): Unit
  }
  object TypeofQuerySet {
    
    inline def apply(addSharedMethod: String => Callback): TypeofQuerySet = {
      val __obj = js.Dynamic.literal(addSharedMethod = js.Any.fromFunction1((t0: String) => addSharedMethod(t0).runNow()))
      __obj.asInstanceOf[TypeofQuerySet]
    }
    
    extension [Self <: TypeofQuerySet](x: Self) {
      
      inline def setAddSharedMethod(value: String => Callback): Self = StObject.set(x, "addSharedMethod", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    }
  }
}
