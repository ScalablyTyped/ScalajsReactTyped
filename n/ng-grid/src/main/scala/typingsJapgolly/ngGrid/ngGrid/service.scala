package typingsJapgolly.ngGrid.ngGrid

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object service {
  
  trait IDomUtilityService extends StObject {
    
    def AssignGridContainers(
      $scope: IGridScope,
      rootel: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IAugmentedJQuery */ Any,
      grid: IGridInstance
    ): Unit
    
    def BuildStyles($scope: IGridScope, grid: IGridInstance, digest: Boolean): Unit
    
    var LetterW: Double
    
    def RebuildGrid($scope: IGridScope, grid: IGridInstance): Unit
    
    var ScrollH: Double
    
    var ScrollW: Double
    
    def UpdateGridLayout($scope: IGridScope, grid: IGridInstance): Unit
    
    def digest($scope: IGridScope): Unit
    
    var eventStorage: Any
    
    def getRealWidth(obj: IDimension): Double
    
    var immediate: Double
    
    var numberOfGrids: Double
    
    def setColLeft(col: IColumn, colLeft: Double, grid: IGridInstance): Unit
    
    def setStyleText(grid: IGridInstance, css: String): Unit
  }
  object IDomUtilityService {
    
    inline def apply(
      AssignGridContainers: (IGridScope, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IAugmentedJQuery */ Any, IGridInstance) => Callback,
      BuildStyles: (IGridScope, IGridInstance, Boolean) => Callback,
      LetterW: Double,
      RebuildGrid: (IGridScope, IGridInstance) => Callback,
      ScrollH: Double,
      ScrollW: Double,
      UpdateGridLayout: (IGridScope, IGridInstance) => Callback,
      digest: IGridScope => Callback,
      eventStorage: Any,
      getRealWidth: IDimension => Double,
      immediate: Double,
      numberOfGrids: Double,
      setColLeft: (IColumn, Double, IGridInstance) => Callback,
      setStyleText: (IGridInstance, String) => Callback
    ): IDomUtilityService = {
      val __obj = js.Dynamic.literal(AssignGridContainers = js.Any.fromFunction3((t0: IGridScope, t1: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IAugmentedJQuery */ Any, t2: IGridInstance) => (AssignGridContainers(t0, t1, t2)).runNow()), BuildStyles = js.Any.fromFunction3((t0: IGridScope, t1: IGridInstance, t2: Boolean) => (BuildStyles(t0, t1, t2)).runNow()), LetterW = LetterW.asInstanceOf[js.Any], RebuildGrid = js.Any.fromFunction2((t0: IGridScope, t1: IGridInstance) => (RebuildGrid(t0, t1)).runNow()), ScrollH = ScrollH.asInstanceOf[js.Any], ScrollW = ScrollW.asInstanceOf[js.Any], UpdateGridLayout = js.Any.fromFunction2((t0: IGridScope, t1: IGridInstance) => (UpdateGridLayout(t0, t1)).runNow()), digest = js.Any.fromFunction1((t0: IGridScope) => digest(t0).runNow()), eventStorage = eventStorage.asInstanceOf[js.Any], getRealWidth = js.Any.fromFunction1(getRealWidth), immediate = immediate.asInstanceOf[js.Any], numberOfGrids = numberOfGrids.asInstanceOf[js.Any], setColLeft = js.Any.fromFunction3((t0: IColumn, t1: Double, t2: IGridInstance) => (setColLeft(t0, t1, t2)).runNow()), setStyleText = js.Any.fromFunction2((t0: IGridInstance, t1: String) => (setStyleText(t0, t1)).runNow()))
      __obj.asInstanceOf[IDomUtilityService]
    }
    
    extension [Self <: IDomUtilityService](x: Self) {
      
      inline def setAssignGridContainers(
        value: (IGridScope, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IAugmentedJQuery */ Any, IGridInstance) => Callback
      ): Self = StObject.set(x, "AssignGridContainers", js.Any.fromFunction3((t0: IGridScope, t1: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IAugmentedJQuery */ Any, t2: IGridInstance) => (value(t0, t1, t2)).runNow()))
      
      inline def setBuildStyles(value: (IGridScope, IGridInstance, Boolean) => Callback): Self = StObject.set(x, "BuildStyles", js.Any.fromFunction3((t0: IGridScope, t1: IGridInstance, t2: Boolean) => (value(t0, t1, t2)).runNow()))
      
      inline def setDigest(value: IGridScope => Callback): Self = StObject.set(x, "digest", js.Any.fromFunction1((t0: IGridScope) => value(t0).runNow()))
      
      inline def setEventStorage(value: Any): Self = StObject.set(x, "eventStorage", value.asInstanceOf[js.Any])
      
      inline def setGetRealWidth(value: IDimension => Double): Self = StObject.set(x, "getRealWidth", js.Any.fromFunction1(value))
      
      inline def setImmediate(value: Double): Self = StObject.set(x, "immediate", value.asInstanceOf[js.Any])
      
      inline def setLetterW(value: Double): Self = StObject.set(x, "LetterW", value.asInstanceOf[js.Any])
      
      inline def setNumberOfGrids(value: Double): Self = StObject.set(x, "numberOfGrids", value.asInstanceOf[js.Any])
      
      inline def setRebuildGrid(value: (IGridScope, IGridInstance) => Callback): Self = StObject.set(x, "RebuildGrid", js.Any.fromFunction2((t0: IGridScope, t1: IGridInstance) => (value(t0, t1)).runNow()))
      
      inline def setScrollH(value: Double): Self = StObject.set(x, "ScrollH", value.asInstanceOf[js.Any])
      
      inline def setScrollW(value: Double): Self = StObject.set(x, "ScrollW", value.asInstanceOf[js.Any])
      
      inline def setSetColLeft(value: (IColumn, Double, IGridInstance) => Callback): Self = StObject.set(x, "setColLeft", js.Any.fromFunction3((t0: IColumn, t1: Double, t2: IGridInstance) => (value(t0, t1, t2)).runNow()))
      
      inline def setSetStyleText(value: (IGridInstance, String) => Callback): Self = StObject.set(x, "setStyleText", js.Any.fromFunction2((t0: IGridInstance, t1: String) => (value(t0, t1)).runNow()))
      
      inline def setUpdateGridLayout(value: (IGridScope, IGridInstance) => Callback): Self = StObject.set(x, "UpdateGridLayout", js.Any.fromFunction2((t0: IGridScope, t1: IGridInstance) => (value(t0, t1)).runNow()))
    }
  }
  
  trait ISortInfo extends StObject {
    
    var fields: js.Array[String]
  }
  object ISortInfo {
    
    inline def apply(fields: js.Array[String]): ISortInfo = {
      val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
      __obj.asInstanceOf[ISortInfo]
    }
    
    extension [Self <: ISortInfo](x: Self) {
      
      inline def setFields(value: js.Array[String]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      inline def setFieldsVarargs(value: String*): Self = StObject.set(x, "fields", js.Array(value*))
    }
  }
  
  trait ISortService extends StObject {
    
    def Sort(sortInfo: ISortInfo, data: Any): Unit
    
    def basicSort(a: Any, b: Any): Double
    
    var colSortFnCache: Any
    
    def getSortFn(col: IColumn, data: Any): js.Function2[/* a */ Any, /* b */ Any, Double]
    
    def guessSortFn(item: Any): js.Function2[/* a */ Any, /* b */ Any, Double]
    
    var isCustomSort: Boolean
    
    var isSorting: Boolean
    
    def sortAlpha(a: String, b: String): Double
    
    def sortBool(a: Boolean, b: Boolean): Double
    
    def sortData(sortInfo: ISortInfo, data: Any): Unit
    
    def sortDate(a: js.Date, b: js.Date): Double
    
    def sortNumber(a: Double, b: Double): Double
    
    def sortNumberStr(a: String, b: String): Double
  }
  object ISortService {
    
    inline def apply(
      Sort: (ISortInfo, Any) => Callback,
      basicSort: (Any, Any) => Double,
      colSortFnCache: Any,
      getSortFn: (IColumn, Any) => js.Function2[/* a */ Any, /* b */ Any, Double],
      guessSortFn: Any => js.Function2[/* a */ Any, /* b */ Any, Double],
      isCustomSort: Boolean,
      isSorting: Boolean,
      sortAlpha: (String, String) => Double,
      sortBool: (Boolean, Boolean) => Double,
      sortData: (ISortInfo, Any) => Callback,
      sortDate: (js.Date, js.Date) => Double,
      sortNumber: (Double, Double) => Double,
      sortNumberStr: (String, String) => Double
    ): ISortService = {
      val __obj = js.Dynamic.literal(Sort = js.Any.fromFunction2((t0: ISortInfo, t1: Any) => (Sort(t0, t1)).runNow()), basicSort = js.Any.fromFunction2(basicSort), colSortFnCache = colSortFnCache.asInstanceOf[js.Any], getSortFn = js.Any.fromFunction2(getSortFn), guessSortFn = js.Any.fromFunction1(guessSortFn), isCustomSort = isCustomSort.asInstanceOf[js.Any], isSorting = isSorting.asInstanceOf[js.Any], sortAlpha = js.Any.fromFunction2(sortAlpha), sortBool = js.Any.fromFunction2(sortBool), sortData = js.Any.fromFunction2((t0: ISortInfo, t1: Any) => (sortData(t0, t1)).runNow()), sortDate = js.Any.fromFunction2(sortDate), sortNumber = js.Any.fromFunction2(sortNumber), sortNumberStr = js.Any.fromFunction2(sortNumberStr))
      __obj.asInstanceOf[ISortService]
    }
    
    extension [Self <: ISortService](x: Self) {
      
      inline def setBasicSort(value: (Any, Any) => Double): Self = StObject.set(x, "basicSort", js.Any.fromFunction2(value))
      
      inline def setColSortFnCache(value: Any): Self = StObject.set(x, "colSortFnCache", value.asInstanceOf[js.Any])
      
      inline def setGetSortFn(value: (IColumn, Any) => js.Function2[/* a */ Any, /* b */ Any, Double]): Self = StObject.set(x, "getSortFn", js.Any.fromFunction2(value))
      
      inline def setGuessSortFn(value: Any => js.Function2[/* a */ Any, /* b */ Any, Double]): Self = StObject.set(x, "guessSortFn", js.Any.fromFunction1(value))
      
      inline def setIsCustomSort(value: Boolean): Self = StObject.set(x, "isCustomSort", value.asInstanceOf[js.Any])
      
      inline def setIsSorting(value: Boolean): Self = StObject.set(x, "isSorting", value.asInstanceOf[js.Any])
      
      inline def setSort(value: (ISortInfo, Any) => Callback): Self = StObject.set(x, "Sort", js.Any.fromFunction2((t0: ISortInfo, t1: Any) => (value(t0, t1)).runNow()))
      
      inline def setSortAlpha(value: (String, String) => Double): Self = StObject.set(x, "sortAlpha", js.Any.fromFunction2(value))
      
      inline def setSortBool(value: (Boolean, Boolean) => Double): Self = StObject.set(x, "sortBool", js.Any.fromFunction2(value))
      
      inline def setSortData(value: (ISortInfo, Any) => Callback): Self = StObject.set(x, "sortData", js.Any.fromFunction2((t0: ISortInfo, t1: Any) => (value(t0, t1)).runNow()))
      
      inline def setSortDate(value: (js.Date, js.Date) => Double): Self = StObject.set(x, "sortDate", js.Any.fromFunction2(value))
      
      inline def setSortNumber(value: (Double, Double) => Double): Self = StObject.set(x, "sortNumber", js.Any.fromFunction2(value))
      
      inline def setSortNumberStr(value: (String, String) => Double): Self = StObject.set(x, "sortNumberStr", js.Any.fromFunction2(value))
    }
  }
  
  trait IUtilityService extends StObject {
    
    def endsWith(str: String, suffix: String): Boolean
    
    def evalProperty(entity: Any, path: String): Any
    
    def forIn(obj: Any, action: js.Function2[/* value */ Any, /* property */ String, js.Object]): Unit
    
    def getElementsByClassName(cl: String): js.Array[Any]
    
    def getInstanceType(o: Any): String
    
    def isNullOrUndefined(obj: Any): Boolean
    
    def newId(): String
    
    def seti18n($scope: IGridScope, language: String): Unit
    
    def visualLength(node: Any): Double
  }
  object IUtilityService {
    
    inline def apply(
      endsWith: (String, String) => Boolean,
      evalProperty: (Any, String) => Any,
      forIn: (Any, js.Function2[/* value */ Any, /* property */ String, js.Object]) => Callback,
      getElementsByClassName: String => js.Array[Any],
      getInstanceType: Any => String,
      isNullOrUndefined: Any => Boolean,
      newId: CallbackTo[String],
      seti18n: (IGridScope, String) => Callback,
      visualLength: Any => Double
    ): IUtilityService = {
      val __obj = js.Dynamic.literal(endsWith = js.Any.fromFunction2(endsWith), evalProperty = js.Any.fromFunction2(evalProperty), forIn = js.Any.fromFunction2((t0: Any, t1: js.Function2[/* value */ Any, /* property */ String, js.Object]) => (forIn(t0, t1)).runNow()), getElementsByClassName = js.Any.fromFunction1(getElementsByClassName), getInstanceType = js.Any.fromFunction1(getInstanceType), isNullOrUndefined = js.Any.fromFunction1(isNullOrUndefined), newId = newId.toJsFn, seti18n = js.Any.fromFunction2((t0: IGridScope, t1: String) => (seti18n(t0, t1)).runNow()), visualLength = js.Any.fromFunction1(visualLength))
      __obj.asInstanceOf[IUtilityService]
    }
    
    extension [Self <: IUtilityService](x: Self) {
      
      inline def setEndsWith(value: (String, String) => Boolean): Self = StObject.set(x, "endsWith", js.Any.fromFunction2(value))
      
      inline def setEvalProperty(value: (Any, String) => Any): Self = StObject.set(x, "evalProperty", js.Any.fromFunction2(value))
      
      inline def setForIn(value: (Any, js.Function2[/* value */ Any, /* property */ String, js.Object]) => Callback): Self = StObject.set(x, "forIn", js.Any.fromFunction2((t0: Any, t1: js.Function2[/* value */ Any, /* property */ String, js.Object]) => (value(t0, t1)).runNow()))
      
      inline def setGetElementsByClassName(value: String => js.Array[Any]): Self = StObject.set(x, "getElementsByClassName", js.Any.fromFunction1(value))
      
      inline def setGetInstanceType(value: Any => String): Self = StObject.set(x, "getInstanceType", js.Any.fromFunction1(value))
      
      inline def setIsNullOrUndefined(value: Any => Boolean): Self = StObject.set(x, "isNullOrUndefined", js.Any.fromFunction1(value))
      
      inline def setNewId(value: CallbackTo[String]): Self = StObject.set(x, "newId", value.toJsFn)
      
      inline def setSeti18n(value: (IGridScope, String) => Callback): Self = StObject.set(x, "seti18n", js.Any.fromFunction2((t0: IGridScope, t1: String) => (value(t0, t1)).runNow()))
      
      inline def setVisualLength(value: Any => Double): Self = StObject.set(x, "visualLength", js.Any.fromFunction1(value))
    }
  }
}
