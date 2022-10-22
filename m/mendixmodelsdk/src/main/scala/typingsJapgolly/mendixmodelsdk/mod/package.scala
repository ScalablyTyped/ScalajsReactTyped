package typingsJapgolly.mendixmodelsdk.mod

import typingsJapgolly.mendixmodelsdk.anon.ToRawChangeValue
import typingsJapgolly.mendixmodelsdk.mod.^
import typingsJapgolly.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typingsJapgolly.mendixmodelsdk.srcSdkInternalDeltasTransactionManagerMod.ITransactionOptions
import typingsJapgolly.mendixmodelsdk.srcSdkInternalInstancesMod.IList
import typingsJapgolly.mendixmodelsdk.srcSdkInternalStructuresMod.IStructure
import typingsJapgolly.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.Container
import typingsJapgolly.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.IContainer
import typingsJapgolly.mendixmodelsdk.srcSdkInternalTransportInterfacesMod.IAbstractElementJson
import typingsJapgolly.mendixmodelsdk.srcSdkInternalUnitsMod.IStructuralUnit
import typingsJapgolly.mendixmodelsdk.srcSdkUtilsMod.utils.IMap
import typingsJapgolly.mobx.distTypesObservablearrayMod.IArrayWillChange
import typingsJapgolly.mobx.distTypesObservablearrayMod.IArrayWillSplice
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def MAX_METAMODEL_VERSION: String = ^.asInstanceOf[js.Dynamic].selectDynamic("MAX_METAMODEL_VERSION").asInstanceOf[String]

inline def SDK_VERSION: String = ^.asInstanceOf[js.Dynamic].selectDynamic("SDK_VERSION").asInstanceOf[String]

inline def beginTransaction(model: IAbstractModel): typingsJapgolly.mendixmodelsdk.srcSdkInternalDeltasTransactionManagerMod.Transaction = ^.asInstanceOf[js.Dynamic].applyDynamic("beginTransaction")(model.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcSdkInternalDeltasTransactionManagerMod.Transaction]
inline def beginTransaction(model: IAbstractModel, options: ITransactionOptions): typingsJapgolly.mendixmodelsdk.srcSdkInternalDeltasTransactionManagerMod.Transaction = (^.asInstanceOf[js.Dynamic].applyDynamic("beginTransaction")(model.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcSdkInternalDeltasTransactionManagerMod.Transaction]

inline def createElementFromJSON(model: IAbstractModel, json: IAbstractElementJson): typingsJapgolly.mendixmodelsdk.srcSdkInternalElementsMod.Element[IAbstractModel] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElementFromJSON")(model.asInstanceOf[js.Any], json.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcSdkInternalElementsMod.Element[IAbstractModel]]
inline def createElementFromJSON(
  model: IAbstractModel,
  json: IAbstractElementJson,
  idToStructureMap: IMap[
  typingsJapgolly.mendixmodelsdk.srcSdkInternalStructuresMod.Structure[IAbstractModel, IContainer | Null]
]
): typingsJapgolly.mendixmodelsdk.srcSdkInternalElementsMod.Element[IAbstractModel] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElementFromJSON")(model.asInstanceOf[js.Any], json.asInstanceOf[js.Any], idToStructureMap.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcSdkInternalElementsMod.Element[IAbstractModel]]

inline def createModelUnitFromJSON(containerUnit: IStructuralUnit, containmentName: String, contents: IAbstractElementJson): typingsJapgolly.mendixmodelsdk.srcSdkInternalUnitsMod.ModelUnit[IAbstractModel] = (^.asInstanceOf[js.Dynamic].applyDynamic("createModelUnitFromJSON")(containerUnit.asInstanceOf[js.Any], containmentName.asInstanceOf[js.Any], contents.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcSdkInternalUnitsMod.ModelUnit[IAbstractModel]]

inline def instantiateChildElement(
  parent: typingsJapgolly.mendixmodelsdk.srcSdkInternalElementsMod.AbstractElement[IAbstractModel, Container]
): typingsJapgolly.mendixmodelsdk.srcSdkInternalElementsMod.Element[IAbstractModel] | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("instantiateChildElement")(parent.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcSdkInternalElementsMod.Element[IAbstractModel] | Null]
inline def instantiateChildElement(
  parent: typingsJapgolly.mendixmodelsdk.srcSdkInternalElementsMod.AbstractElement[IAbstractModel, Container],
  value: IAbstractElementJson
): typingsJapgolly.mendixmodelsdk.srcSdkInternalElementsMod.Element[IAbstractModel] | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("instantiateChildElement")(parent.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcSdkInternalElementsMod.Element[IAbstractModel] | Null]

inline def isNamedElement(element: IStructure): /* is mendixmodelsdk.mendixmodelsdk/src/sdk/internal/properties/LocalByNameReferenceProperty.INamedElement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNamedElement")(element.asInstanceOf[js.Any]).asInstanceOf[/* is mendixmodelsdk.mendixmodelsdk/src/sdk/internal/properties/LocalByNameReferenceProperty.INamedElement */ Boolean]

inline def runInTransaction[T](model: IAbstractModel, action: js.Function0[js.Promise[T]]): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("runInTransaction")(model.asInstanceOf[js.Any], action.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
inline def runInTransaction[T](model: IAbstractModel, options: ITransactionOptions, action: js.Function0[js.Promise[T]]): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("runInTransaction")(model.asInstanceOf[js.Any], options.asInstanceOf[js.Any], action.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]

inline def runInTransaction_T_T[T](model: IAbstractModel, action: js.Function0[T]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("runInTransaction")(model.asInstanceOf[js.Any], action.asInstanceOf[js.Any])).asInstanceOf[T]
inline def runInTransaction_T_T[T](model: IAbstractModel, options: ITransactionOptions, action: js.Function0[T]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("runInTransaction")(model.asInstanceOf[js.Any], options.asInstanceOf[js.Any], action.asInstanceOf[js.Any])).asInstanceOf[T]

inline def sendListChangeDeltas[T, P](
  property: (typingsJapgolly.mendixmodelsdk.srcSdkInternalPropertiesAbstractPropertyMod.AbstractProperty[js.Array[T], IList[P]]) & ToRawChangeValue[P],
  change: IArrayWillChange[P]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sendListChangeDeltas")(property.asInstanceOf[js.Any], change.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def sendListChangeDeltas[T, P](
  property: (typingsJapgolly.mendixmodelsdk.srcSdkInternalPropertiesAbstractPropertyMod.AbstractProperty[js.Array[T], IList[P]]) & ToRawChangeValue[P],
  change: IArrayWillSplice[P]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sendListChangeDeltas")(property.asInstanceOf[js.Any], change.asInstanceOf[js.Any])).asInstanceOf[Unit]
