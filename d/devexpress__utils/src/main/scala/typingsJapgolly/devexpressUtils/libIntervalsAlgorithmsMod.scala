package typingsJapgolly.devexpressUtils

import typingsJapgolly.devexpressUtils.anon.Interval
import typingsJapgolly.devexpressUtils.anon.IntervalConstInterval
import typingsJapgolly.devexpressUtils.libIntervalsConstMod.ConstInterval
import typingsJapgolly.devexpressUtils.libIntervalsFixedMod.FixedInterval
import typingsJapgolly.devexpressUtils.libIntervalsMutableMod.MutableInterval
import typingsJapgolly.devexpressUtils.libIntervalsReproducibleMod.IReproducibleInterval
import typingsJapgolly.devexpressUtils.libIntervalsSparseIntervalsMod.SparseIntervals
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIntervalsAlgorithmsMod {
  
  @JSImport("@devexpress/utils/lib/intervals/algorithms", "IntervalAlgorithms")
  @js.native
  open class IntervalAlgorithms () extends StObject
  /* static members */
  object IntervalAlgorithms {
    
    @JSImport("@devexpress/utils/lib/intervals/algorithms", "IntervalAlgorithms")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getAffectedObjects[T /* <: MutableInterval */, TObj /* <: Interval[T] */](objects: js.Array[TObj], intervals: js.Array[T & IReproducibleInterval[T]]): SparseIntervals[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("getAffectedObjects")(objects.asInstanceOf[js.Any], intervals.asInstanceOf[js.Any])).asInstanceOf[SparseIntervals[T]]
    inline def getAffectedObjects[T /* <: MutableInterval */, TObj /* <: Interval[T] */](
      objects: js.Array[TObj],
      intervals: js.Array[T & IReproducibleInterval[T]],
      getFirstIndex: js.Function2[/* start */ Double, /* objects */ js.Array[TObj], Double]
    ): SparseIntervals[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("getAffectedObjects")(objects.asInstanceOf[js.Any], intervals.asInstanceOf[js.Any], getFirstIndex.asInstanceOf[js.Any])).asInstanceOf[SparseIntervals[T]]
    inline def getAffectedObjects[T /* <: MutableInterval */, TObj /* <: Interval[T] */](
      objects: js.Array[TObj],
      intervals: js.Array[T & IReproducibleInterval[T]],
      getFirstIndex: js.Function2[/* start */ Double, /* objects */ js.Array[TObj], Double],
      conflictResolver: js.Function3[
          /* objectInterval */ ConstInterval, 
          /* touchingIntervalLength */ Double, 
          /* touchPoint */ Double, 
          Boolean
        ]
    ): SparseIntervals[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("getAffectedObjects")(objects.asInstanceOf[js.Any], intervals.asInstanceOf[js.Any], getFirstIndex.asInstanceOf[js.Any], conflictResolver.asInstanceOf[js.Any])).asInstanceOf[SparseIntervals[T]]
    inline def getAffectedObjects[T /* <: MutableInterval */, TObj /* <: Interval[T] */](
      objects: js.Array[TObj],
      intervals: js.Array[T & IReproducibleInterval[T]],
      getFirstIndex: Unit,
      conflictResolver: js.Function3[
          /* objectInterval */ ConstInterval, 
          /* touchingIntervalLength */ Double, 
          /* touchPoint */ Double, 
          Boolean
        ]
    ): SparseIntervals[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("getAffectedObjects")(objects.asInstanceOf[js.Any], intervals.asInstanceOf[js.Any], getFirstIndex.asInstanceOf[js.Any], conflictResolver.asInstanceOf[js.Any])).asInstanceOf[SparseIntervals[T]]
    
    inline def getAffectedObjectsTemplate[ResultIntervalT /* <: MutableInterval */, TemplateT /* <: IReproducibleInterval[ResultIntervalT] */, TObj /* <: IntervalConstInterval */](objects: js.Array[TObj], intervals: js.Array[ConstInterval], template: TemplateT): SparseIntervals[ResultIntervalT] = (^.asInstanceOf[js.Dynamic].applyDynamic("getAffectedObjectsTemplate")(objects.asInstanceOf[js.Any], intervals.asInstanceOf[js.Any], template.asInstanceOf[js.Any])).asInstanceOf[SparseIntervals[ResultIntervalT]]
    inline def getAffectedObjectsTemplate[ResultIntervalT /* <: MutableInterval */, TemplateT /* <: IReproducibleInterval[ResultIntervalT] */, TObj /* <: IntervalConstInterval */](
      objects: js.Array[TObj],
      intervals: js.Array[ConstInterval],
      template: TemplateT,
      getFirstIndex: js.Function2[/* start */ Double, /* objects */ js.Array[TObj], Double]
    ): SparseIntervals[ResultIntervalT] = (^.asInstanceOf[js.Dynamic].applyDynamic("getAffectedObjectsTemplate")(objects.asInstanceOf[js.Any], intervals.asInstanceOf[js.Any], template.asInstanceOf[js.Any], getFirstIndex.asInstanceOf[js.Any])).asInstanceOf[SparseIntervals[ResultIntervalT]]
    inline def getAffectedObjectsTemplate[ResultIntervalT /* <: MutableInterval */, TemplateT /* <: IReproducibleInterval[ResultIntervalT] */, TObj /* <: IntervalConstInterval */](
      objects: js.Array[TObj],
      intervals: js.Array[ConstInterval],
      template: TemplateT,
      getFirstIndex: js.Function2[/* start */ Double, /* objects */ js.Array[TObj], Double],
      conflictResolver: js.Function3[
          /* objectInterval */ ConstInterval, 
          /* touchingIntervalLength */ Double, 
          /* touchPoint */ Double, 
          Boolean
        ]
    ): SparseIntervals[ResultIntervalT] = (^.asInstanceOf[js.Dynamic].applyDynamic("getAffectedObjectsTemplate")(objects.asInstanceOf[js.Any], intervals.asInstanceOf[js.Any], template.asInstanceOf[js.Any], getFirstIndex.asInstanceOf[js.Any], conflictResolver.asInstanceOf[js.Any])).asInstanceOf[SparseIntervals[ResultIntervalT]]
    inline def getAffectedObjectsTemplate[ResultIntervalT /* <: MutableInterval */, TemplateT /* <: IReproducibleInterval[ResultIntervalT] */, TObj /* <: IntervalConstInterval */](
      objects: js.Array[TObj],
      intervals: js.Array[ConstInterval],
      template: TemplateT,
      getFirstIndex: Unit,
      conflictResolver: js.Function3[
          /* objectInterval */ ConstInterval, 
          /* touchingIntervalLength */ Double, 
          /* touchPoint */ Double, 
          Boolean
        ]
    ): SparseIntervals[ResultIntervalT] = (^.asInstanceOf[js.Dynamic].applyDynamic("getAffectedObjectsTemplate")(objects.asInstanceOf[js.Any], intervals.asInstanceOf[js.Any], template.asInstanceOf[js.Any], getFirstIndex.asInstanceOf[js.Any], conflictResolver.asInstanceOf[js.Any])).asInstanceOf[SparseIntervals[ResultIntervalT]]
    
    inline def getIntersection[T /* <: ConstInterval */](intervalA: T & IReproducibleInterval[T], intervalB: T): T | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getIntersection")(intervalA.asInstanceOf[js.Any], intervalB.asInstanceOf[js.Any])).asInstanceOf[T | Null]
    
    inline def getIntersectionNonNullLength[T /* <: ConstInterval */](intervalA: T & IReproducibleInterval[T], intervalB: ConstInterval): T | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getIntersectionNonNullLength")(intervalA.asInstanceOf[js.Any], intervalB.asInstanceOf[js.Any])).asInstanceOf[T | Null]
    
    inline def getIntersectionNonNullLengthTemplate[ResultIntervalT /* <: ConstInterval */, TemplateT /* <: IReproducibleInterval[ResultIntervalT] */](intervalA: ConstInterval, intervalB: ConstInterval, template: TemplateT): ResultIntervalT | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getIntersectionNonNullLengthTemplate")(intervalA.asInstanceOf[js.Any], intervalB.asInstanceOf[js.Any], template.asInstanceOf[js.Any])).asInstanceOf[ResultIntervalT | Null]
    
    inline def getIntersectionTemplate[ResultIntervalT /* <: ConstInterval */, TemplateT /* <: IReproducibleInterval[ResultIntervalT] */](intervalA: ConstInterval, intervalB: ConstInterval, template: TemplateT): ResultIntervalT | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getIntersectionTemplate")(intervalA.asInstanceOf[js.Any], intervalB.asInstanceOf[js.Any], template.asInstanceOf[js.Any])).asInstanceOf[ResultIntervalT | Null]
    
    inline def getIntersectionsTwoArraysOfInterval[T /* <: MutableInterval */](intervalsA: js.Array[T & IReproducibleInterval[T]], intervalsB: js.Array[ConstInterval]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("getIntersectionsTwoArraysOfInterval")(intervalsA.asInstanceOf[js.Any], intervalsB.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
    
    inline def getIntersectionsTwoArraysOfIntervalTemplate[ResultIntervalT /* <: MutableInterval */, TemplateT /* <: IReproducibleInterval[ResultIntervalT] */](intervalsA: js.Array[ConstInterval], intervalsB: js.Array[ConstInterval], template: TemplateT): js.Array[ResultIntervalT] = (^.asInstanceOf[js.Dynamic].applyDynamic("getIntersectionsTwoArraysOfIntervalTemplate")(intervalsA.asInstanceOf[js.Any], intervalsB.asInstanceOf[js.Any], template.asInstanceOf[js.Any])).asInstanceOf[js.Array[ResultIntervalT]]
    
    inline def getMergedIntervals[T /* <: ConstInterval */](intervals: js.Array[T & IReproducibleInterval[T]], needSort: Boolean): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("getMergedIntervals")(intervals.asInstanceOf[js.Any], needSort.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
    
    inline def getMergedIntervalsTemplate[ResultIntervalT /* <: ConstInterval */](
      intervals: js.Array[ConstInterval],
      needSort: Boolean,
      template: IReproducibleInterval[ResultIntervalT]
    ): js.Array[ResultIntervalT] = (^.asInstanceOf[js.Dynamic].applyDynamic("getMergedIntervalsTemplate")(intervals.asInstanceOf[js.Any], needSort.asInstanceOf[js.Any], template.asInstanceOf[js.Any])).asInstanceOf[js.Array[ResultIntervalT]]
    
    inline def handleAffectedObjects[IntervalT /* <: ConstInterval */, TObj /* <: IntervalConstInterval */](
      objects: js.Array[TObj],
      intervals: js.Array[IntervalT],
      callback: js.Function4[
          /* obj */ TObj, 
          /* index */ Double, 
          /* interval */ IntervalT, 
          /* intersection */ ConstInterval, 
          Unit
        ]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("handleAffectedObjects")(objects.asInstanceOf[js.Any], intervals.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def handleAffectedObjects[IntervalT /* <: ConstInterval */, TObj /* <: IntervalConstInterval */](
      objects: js.Array[TObj],
      intervals: js.Array[IntervalT],
      callback: js.Function4[
          /* obj */ TObj, 
          /* index */ Double, 
          /* interval */ IntervalT, 
          /* intersection */ ConstInterval, 
          Unit
        ],
      getFirstIndex: js.Function2[/* start */ Double, /* objects */ js.Array[TObj], Double]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("handleAffectedObjects")(objects.asInstanceOf[js.Any], intervals.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], getFirstIndex.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def oneConstainsOtherArraysOfInterval(mergedIntervalsA: js.Array[FixedInterval], intervalsB: js.Array[FixedInterval]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("oneConstainsOtherArraysOfInterval")(mergedIntervalsA.asInstanceOf[js.Any], intervalsB.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def reflectIntervals[T /* <: ConstInterval */](intervals: js.Array[T], bounds: T & IReproducibleInterval[T]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("reflectIntervals")(intervals.asInstanceOf[js.Any], bounds.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
    
    inline def reflectIntervalsTemplate[ResultT /* <: ConstInterval */](
      intervals: js.Array[ConstInterval],
      bounds: ConstInterval,
      template: IReproducibleInterval[ResultT]
    ): js.Array[ResultT] = (^.asInstanceOf[js.Dynamic].applyDynamic("reflectIntervalsTemplate")(intervals.asInstanceOf[js.Any], bounds.asInstanceOf[js.Any], template.asInstanceOf[js.Any])).asInstanceOf[js.Array[ResultT]]
    
    inline def reflectionOfPointOnInterval(value: Double, valInterval: FixedInterval, targetInterval: FixedInterval): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("reflectionOfPointOnInterval")(value.asInstanceOf[js.Any], valInterval.asInstanceOf[js.Any], targetInterval.asInstanceOf[js.Any])).asInstanceOf[Double]
  }
}
