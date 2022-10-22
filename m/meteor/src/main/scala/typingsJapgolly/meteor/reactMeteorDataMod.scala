package typingsJapgolly.meteor

import japgolly.scalajs.react.facade.React.ComponentClassP
import typingsJapgolly.meteor.anon.GetMeteorData
import typingsJapgolly.meteor.mongoMod.Mongo.Cursor
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.DependencyList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactMeteorDataMod {
  
  @JSImport("meteor/react-meteor-data", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useFind[T](factory: js.Function0[js.UndefOr[(Cursor[T, T]) | Null]]): js.Array[T] | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("useFind")(factory.asInstanceOf[js.Any]).asInstanceOf[js.Array[T] | Null]
  inline def useFind[T](factory: js.Function0[js.UndefOr[(Cursor[T, T]) | Null]], deps: DependencyList): js.Array[T] | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("useFind")(factory.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[js.Array[T] | Null]
  
  inline def useFind_T_Array[T](factory: js.Function0[Cursor[T, T]]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("useFind")(factory.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  inline def useFind_T_Array[T](factory: js.Function0[Cursor[T, T]], deps: DependencyList): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("useFind")(factory.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  inline def useSubscribe(name: String, args: Any*): js.Function0[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("useSubscribe")(scala.List(name.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[js.Function0[Boolean]]
  inline def useSubscribe(name: Unit, args: Any*): js.Function0[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("useSubscribe")(scala.List(name.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[js.Function0[Boolean]]
  
  inline def useTracker[TDataProps](getMeteorData: js.Function0[TDataProps]): TDataProps = ^.asInstanceOf[js.Dynamic].applyDynamic("useTracker")(getMeteorData.asInstanceOf[js.Any]).asInstanceOf[TDataProps]
  inline def useTracker[TDataProps](getMeteorData: js.Function0[TDataProps], deps: DependencyList): TDataProps = (^.asInstanceOf[js.Dynamic].applyDynamic("useTracker")(getMeteorData.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[TDataProps]
  
  inline def withTracker[TDataProps, TOwnProps](options: js.Function1[/* props */ TOwnProps, TDataProps | (GetMeteorData[TOwnProps, TDataProps])]): js.Function1[
    /* reactComponent */ ComponentType[TOwnProps & TDataProps], 
    ComponentClassP[TOwnProps & js.Object]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withTracker")(options.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* reactComponent */ ComponentType[TOwnProps & TDataProps], 
    ComponentClassP[TOwnProps & js.Object]
  ]]
}
